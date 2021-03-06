package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSImportEqualsDeclaration
  extends Statement
     with BaseNode {
  var id: Identifier
  var isExport: Boolean | Null
  var moduleReference: TSEntityName | TSExternalModuleReference
  @JSName("type")
  var type_TSImportEqualsDeclaration: typings.atBabelTypes.atBabelTypesStrings.TSImportEqualsDeclaration
}

object TSImportEqualsDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    moduleReference: TSEntityName | TSExternalModuleReference,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSImportEqualsDeclaration,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    isExport: js.UndefOr[Boolean] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (!js.isUndefined(isExport)) __obj.updateDynamic("isExport")(isExport.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportEqualsDeclaration]
  }
}

@JSImport("@babel/types", "tsImportEqualsDeclaration")
@js.native
object tsImportEqualsDeclaration extends js.Object {
  def apply(id: Identifier, moduleReference: TSEntityName): TSImportEqualsDeclaration = js.native
  def apply(id: Identifier, moduleReference: TSEntityName, isExport: Boolean): TSImportEqualsDeclaration = js.native
  def apply(id: Identifier, moduleReference: TSExternalModuleReference): TSImportEqualsDeclaration = js.native
  def apply(id: Identifier, moduleReference: TSExternalModuleReference, isExport: Boolean): TSImportEqualsDeclaration = js.native
}

