package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDefaultSpecifier
  extends Node
     with ModuleSpecifier {
  var exported: Identifier
  @JSName("type")
  var type_ExportDefaultSpecifier: typings.babelDashTypes.babelDashTypesStrings.ExportDefaultSpecifier
}

object ExportDefaultSpecifier {
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ExportDefaultSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultSpecifier]
  }
}

@JSImport("babel-types", "exportDefaultSpecifier")
@js.native
object exportDefaultSpecifier extends js.Object {
  def apply(): ExportDefaultSpecifier = js.native
  def apply(exported: Identifier): ExportDefaultSpecifier = js.native
}

