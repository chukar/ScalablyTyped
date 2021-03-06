package typings.npm.npmMod.NPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  var int: String
  var started: Boolean
  def start(): Unit
  def stop(): Unit
}

object Spinner {
  @scala.inline
  def apply(int: String, start: () => Unit, started: Boolean, stop: () => Unit): Spinner = {
    val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), started = started.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Spinner]
  }
}

