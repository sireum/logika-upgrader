::/*#! 2> /dev/null                                 #
@ 2>/dev/null # 2>nul & echo off & goto BOF         #
if [ -z ${SIREUM_HOME} ]; then                      #
  echo "Please set SIREUM_HOME env var"             #
  exit -1                                           #
fi                                                  #
exec ${SIREUM_HOME}/bin/sireum slang run "$0" "$@"  #
:BOF
setlocal
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
%SIREUM_HOME%\bin\sireum.bat slang run "%0" %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._

val home = Os.slashDir.up.canon

val test = home / "test"
val testExamples = test / "v3-logika-examples"
val testResult = test / "result"
val ext: String = "logika"
val assembly = home / "out" / "logika-upgrader" / "assemble" / "logika-upgrader.jar.bat"

test.mkdirAll()
testResult.removeAll()
testResult.mkdirAll()

println("Building logika-upgrader ...")
assert(Sireum.run(ISZ("proyek", "assemble", "--jar", "logika-upgrader", "--uber", "--main", "Upgrader", home.string)) == 0)
println()

println(s"Preparing $testExamples ...")
if (!testExamples.exists) {
  proc"git clone https://github.com/sireum/v3-logika-examples".echo.console.at(test).runCheck()
} else {
  proc"git clean -xdf".echo.console.at(testExamples).runCheck()
  proc"git pull".echo.console.at(testExamples).runCheck()
}
println()

println(s"Upgrading examples ...")
val env = ISZ[(String, String)]("PATH" ~> s"${Sireum.javaHomeOpt.get}${Os.pathSepChar}${Os.env("PATH")}")
for (p <- Os.Path.walk(testExamples, F, F, (f: Os.Path) => f.ext == ext)) {
  val rel = testExamples.relativize(p).string
  val out = testResult / ops.StringOps(rel).substring(0, rel.size - ext.size - 1)
  proc"$assembly $p $out".echo.console.env(env).runCheck()
  println()
}

