package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentCommentsDelegate extends js.Object {
  var argument: ExpressionKind | Null
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var delegate: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_ArgumentCommentsDelegate {
  @scala.inline
  def apply(
    argument: ExpressionKind = null,
    comments: js.Array[CommentKind] = null,
    delegate: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): Anon_ArgumentCommentsDelegate = {
    val __obj = js.Dynamic.literal()
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(delegate)) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgumentCommentsDelegate]
  }
}

