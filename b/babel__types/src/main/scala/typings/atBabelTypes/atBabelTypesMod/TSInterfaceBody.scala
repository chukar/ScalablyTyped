package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceBody
  extends BaseNode
     with _Node {
  var body: js.Array[TSTypeElement]
  @JSName("type")
  var type_TSInterfaceBody: typings.atBabelTypes.atBabelTypesStrings.TSInterfaceBody
}

object TSInterfaceBody {
  @scala.inline
  def apply(
    body: js.Array[TSTypeElement],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSInterfaceBody,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSInterfaceBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInterfaceBody]
  }
}

@JSImport("@babel/types", "tsInterfaceBody")
@js.native
object tsInterfaceBody extends js.Object {
  def apply(body: js.Array[TSTypeElement]): TSInterfaceBody = js.native
}

