package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait EnumBooleanBody
  extends EnumBody
     with BaseNode {
  var explicit: Boolean | Null
  var members: js.Array[EnumBooleanMember]
  @JSName("type")
  var type_EnumBooleanBody: typings.atBabelTypes.atBabelTypesStrings.EnumBooleanBody
}

object EnumBooleanBody {
  @scala.inline
  def apply(
    members: js.Array[EnumBooleanMember],
    `type`: typings.atBabelTypes.atBabelTypesStrings.EnumBooleanBody,
    end: Int | Double = null,
    explicit: js.UndefOr[Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): EnumBooleanBody = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(explicit)) __obj.updateDynamic("explicit")(explicit.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBooleanBody]
  }
}

@JSImport("@babel/types", "enumBooleanBody")
@js.native
object enumBooleanBody extends js.Object {
  def apply(members: js.Array[EnumBooleanMember]): EnumBooleanBody = js.native
  def apply(members: js.Array[EnumBooleanMember], explicit: Boolean): EnumBooleanBody = js.native
}

