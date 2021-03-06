package typings.shipitDashUtils

import typings.node.childUnderscoreProcessMod.ExecOptions
import typings.shipitDashCli.shipitDashCliMod.EmptyCallback
import typings.shipitDashCli.shipitDashCliMod.ShipitLocal
import typings.shipitDashCli.shipitDashCliMod.Tasks
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofshipit extends js.Object {
  val domain: js.Any = js.native
  val doneCallback: js.Any = js.native
  val environment: String = js.native
  val isRunning: Boolean = js.native
  val seq: js.Array[_] = js.native
  val tasks: Tasks = js.native
  def blTask(name: String, depsOrFn: js.Array[String]): js.Any = js.native
  def blTask(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): js.Any = js.native
  def blTask(name: String, depsOrFn: EmptyCallback): js.Any = js.native
  def blTask(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): js.Any = js.native
  def emit(name: String): js.Any = js.native
  def initConfig(config: js.Object): typings.shipitDashCli.Typeofshipit = js.native
  def local(command: String): js.Thenable[ShipitLocal] = js.native
  def local(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  def local(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  def log(log: js.Any*): Unit = js.native
  def log(log: js.Any): Unit = js.native
  def on(name: String, callback: js.Function1[/* e */ js.Any, Unit]): js.Any = js.native
  def remote(command: String): js.Thenable[ShipitLocal] = js.native
  def remote(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  def remote(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  def remoteCopy(src: String, dest: String): js.Thenable[ShipitLocal] = js.native
  def remoteCopy(src: String, dest: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  def remoteCopy(
    src: String,
    dest: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  def start(tasks: String*): typings.shipitDashCli.Typeofshipit = js.native
  def start(tasks: String): typings.shipitDashCli.Typeofshipit = js.native
  def start(tasks: js.Array[String]): typings.shipitDashCli.Typeofshipit = js.native
  def task(name: String, depsOrFn: js.Array[String]): typings.shipitDashCli.Typeofshipit = js.native
  def task(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): typings.shipitDashCli.Typeofshipit = js.native
  def task(name: String, depsOrFn: EmptyCallback): typings.shipitDashCli.Typeofshipit = js.native
  def task(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): typings.shipitDashCli.Typeofshipit = js.native
}

