package typings.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Array[_]
  var name: String
  var script: String | js.Function
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Array[_], name: String, script: String | js.Function): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Args]
  }
}

