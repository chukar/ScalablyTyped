package typings.monacoDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comments extends js.Object {
  var comments: Boolean
  var other: Boolean
  var strings: Boolean
}

object Anon_Comments {
  @scala.inline
  def apply(comments: Boolean, other: Boolean, strings: Boolean): Anon_Comments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Comments]
  }
}

