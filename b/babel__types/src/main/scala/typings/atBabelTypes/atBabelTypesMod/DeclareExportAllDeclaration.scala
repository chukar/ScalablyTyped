package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`type`
import typings.atBabelTypes.atBabelTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait DeclareExportAllDeclaration
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var exportKind: `type` | value | Null
  var source: StringLiteral
  @JSName("type")
  var type_DeclareExportAllDeclaration: typings.atBabelTypes.atBabelTypesStrings.DeclareExportAllDeclaration
}

object DeclareExportAllDeclaration {
  @scala.inline
  def apply(
    source: StringLiteral,
    `type`: typings.atBabelTypes.atBabelTypesStrings.DeclareExportAllDeclaration,
    end: Int | Double = null,
    exportKind: `type` | value = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (exportKind != null) __obj.updateDynamic("exportKind")(exportKind.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportAllDeclaration]
  }
}

@JSImport("@babel/types", "declareExportAllDeclaration")
@js.native
object declareExportAllDeclaration extends js.Object {
  def apply(source: StringLiteral): DeclareExportAllDeclaration = js.native
}

