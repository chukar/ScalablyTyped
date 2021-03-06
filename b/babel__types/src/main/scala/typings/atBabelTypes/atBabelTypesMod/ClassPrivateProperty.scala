package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ClassPrivateProperty
  extends Private
     with BaseNode
     with Property {
  var decorators: js.Array[Decorator] | Null
  var key: PrivateName
  @JSName("type")
  var type_ClassPrivateProperty: typings.atBabelTypes.atBabelTypesStrings.ClassPrivateProperty
  var value: Expression | Null
}

object ClassPrivateProperty {
  @scala.inline
  def apply(
    key: PrivateName,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ClassPrivateProperty,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    value: Expression = null
  ): ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrivateProperty]
  }
}

@JSImport("@babel/types", "classPrivateProperty")
@js.native
object classPrivateProperty extends js.Object {
  def apply(key: PrivateName): ClassPrivateProperty = js.native
  def apply(key: PrivateName, value: Null, decorators: js.Array[Decorator]): ClassPrivateProperty = js.native
  def apply(key: PrivateName, value: Expression): ClassPrivateProperty = js.native
  def apply(key: PrivateName, value: Expression, decorators: js.Array[Decorator]): ClassPrivateProperty = js.native
}

