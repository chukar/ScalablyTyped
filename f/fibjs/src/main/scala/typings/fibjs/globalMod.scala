package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`10`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`5`
import typings.fibjs.fibjsNumbers.`6`
import typings.fibjs.fibjsNumbers.`7`
import typings.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 全局对象，所有脚本均可以访问的基础对象
	* @detail 
	*/
@JSImport("global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  @js.native
  class Buffer () extends Class_Buffer
  
  @js.native
  class Int64 () extends Class_Int64
  
  val Master: Class_Worker = js.native
  val __dirname: String = js.native
  val __filename: String = js.native
  val argv: js.Array[js.Any] = js.native
  val global: js.Object = js.native
  def GC(): Unit = js.native
  def clearHrInterval(t: js.Any): Unit = js.native
  def clearImmediate(t: js.Any): Unit = js.native
  def clearInterval(t: js.Any): Unit = js.native
  def clearTimeout(t: js.Any): Unit = js.native
  def repl(): Unit = js.native
  def repl(cmds: js.Array[_]): Unit = js.native
  def repl(out: Class_Stream): Unit = js.native
  def repl(out: Class_Stream, cmds: js.Array[_]): Unit = js.native
  def require(id: String): js.Any = js.native
  def run(fname: String): Unit = js.native
  def run(fname: String, argv: js.Array[_]): Unit = js.native
  def setHrInterval(callback: js.Function, timeout: Double, args: js.Any*): Class_Timer = js.native
  def setImmediate(callback: js.Function, args: js.Any*): Class_Timer = js.native
  def setInterval(callback: js.Function, timeout: Double, args: js.Any*): Class_Timer = js.native
  def setTimeout(callback: js.Function): Class_Timer = js.native
  def setTimeout(callback: js.Function, timeout: Double, args: js.Any*): Class_Timer = js.native
  @js.native
  object console extends js.Object {
    val ALERT: `1` = js.native
    val CRIT: `2` = js.native
    val DEBUG: `7` = js.native
    val ERROR: `3` = js.native
    val FATAL: `0` = js.native
    val INFO: `6` = js.native
    val NOTICE: `5` = js.native
    val NOTSET: `10` = js.native
    val PRINT: `9` = js.native
    val WARN: `4` = js.native
    val height: Double = js.native
    val loglevel: Double = js.native
    val width: Double = js.native
    def add(cfg: js.Array[_]): Unit = js.native
    def add(cfg: js.Object): Unit = js.native
    def add(`type`: String): Unit = js.native
    def alert(args: js.Any*): Unit = js.native
    def alert(fmt: String, args: js.Any*): Unit = js.native
    def assert(value: js.Any): Unit = js.native
    def assert(value: js.Any, msg: String): Unit = js.native
    def clear(): Unit = js.native
    def clickMouse(button: String): Unit = js.native
    def clickMouse(button: String, dbclick: Boolean): Unit = js.native
    def crit(args: js.Any*): Unit = js.native
    def crit(fmt: String, args: js.Any*): Unit = js.native
    def debug(args: js.Any*): Unit = js.native
    def debug(fmt: String, args: js.Any*): Unit = js.native
    def dir(obj: js.Any): Unit = js.native
    def error(args: js.Any*): Unit = js.native
    def error(fmt: String, args: js.Any*): Unit = js.native
    def hideCursor(): Unit = js.native
    def info(args: js.Any*): Unit = js.native
    def info(fmt: String, args: js.Any*): Unit = js.native
    def keyDown(key: String): Unit = js.native
    def keyDown(key: String, modifier: String): Unit = js.native
    def keyDown(key: String, modifier: js.Array[_]): Unit = js.native
    def keyTap(key: String): Unit = js.native
    def keyTap(key: String, modifier: String): Unit = js.native
    def keyTap(key: String, modifier: js.Array[_]): Unit = js.native
    def keyUp(key: String): Unit = js.native
    def keyUp(key: String, modifier: String): Unit = js.native
    def keyUp(key: String, modifier: js.Array[_]): Unit = js.native
    def log(args: js.Any*): Unit = js.native
    def log(fmt: String, args: js.Any*): Unit = js.native
    def mouseDown(button: String): Unit = js.native
    def mouseUp(button: String): Unit = js.native
    def moveMouse(x: Double, y: Double): Unit = js.native
    def moveTo(row: Double, column: Double): Unit = js.native
    def notice(args: js.Any*): Unit = js.native
    def notice(fmt: String, args: js.Any*): Unit = js.native
    def print(args: js.Any*): Unit = js.native
    def print(fmt: String, args: js.Any*): Unit = js.native
    def readLine(): String = js.native
    def readLine(msg: String): String = js.native
    def reset(): Unit = js.native
    def showCursor(): Unit = js.native
    def time(): Unit = js.native
    def time(label: String): Unit = js.native
    def timeElapse(): Unit = js.native
    def timeElapse(label: String): Unit = js.native
    def timeEnd(): Unit = js.native
    def timeEnd(label: String): Unit = js.native
    def trace(): Unit = js.native
    def trace(label: String): Unit = js.native
    def typeString(text: String): Unit = js.native
    def warn(args: js.Any*): Unit = js.native
    def warn(fmt: String, args: js.Any*): Unit = js.native
  }
  
  @js.native
  object process extends js.Object {
    val arch: String = js.native
    val argv: js.Array[_] = js.native
    val env: js.Object = js.native
    val execArgv: js.Array[_] = js.native
    val execPath: String = js.native
    val exitCode: Double = js.native
    val platform: String = js.native
    val stderr: Class_File = js.native
    val stdin: Class_File = js.native
    val stdout: Class_File = js.native
    val version: String = js.native
    val versions: js.Object = js.native
    def chdir(directory: String): Unit = js.native
    def cwd(): String = js.native
    def exit(): Unit = js.native
    def exit(code: Double): Unit = js.native
    def hrtime(): js.Array[_] = js.native
    def hrtime(diff: js.Array[_]): js.Array[_] = js.native
    def memoryUsage(): js.Object = js.native
    def nextTick(func: js.Function, args: js.Any*): Unit = js.native
    def open(command: String): Class_SubProcess = js.native
    def open(command: String, args: js.Array[_]): Class_SubProcess = js.native
    def open(command: String, args: js.Array[_], opts: js.Object): Class_SubProcess = js.native
    def open(command: String, opts: js.Object): Class_SubProcess = js.native
    def run(command: String): Double = js.native
    def run(command: String, args: js.Array[_]): Double = js.native
    def run(command: String, args: js.Array[_], opts: js.Object): Double = js.native
    def run(command: String, opts: js.Object): Double = js.native
    def start(command: String): Class_SubProcess = js.native
    def start(command: String, args: js.Array[_]): Class_SubProcess = js.native
    def start(command: String, args: js.Array[_], opts: js.Object): Class_SubProcess = js.native
    def start(command: String, opts: js.Object): Class_SubProcess = js.native
    def umask(): Double = js.native
    def umask(mask: String): Double = js.native
    def umask(mask: Double): Double = js.native
    def uptime(): Double = js.native
  }
  
}

