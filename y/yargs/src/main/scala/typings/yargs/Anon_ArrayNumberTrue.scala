package typings.yargs

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayNumberTrue extends js.Object {
  var array: `true`
  var `type`: number
}

object Anon_ArrayNumberTrue {
  @scala.inline
  def apply(array: `true`, `type`: number): Anon_ArrayNumberTrue = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArrayNumberTrue]
  }
}

