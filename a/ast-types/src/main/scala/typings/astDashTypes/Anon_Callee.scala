package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callee extends js.Object {
  var callee: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var `object`: ExpressionKind | Null
}

object Anon_Callee {
  @scala.inline
  def apply(
    callee: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    `object`: ExpressionKind = null
  ): Anon_Callee = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Callee]
  }
}

