package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait ArrayPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var elements: js.Array[PatternKind | SpreadElementKind | Null]
  var `type`: typings.astDashTypes.astDashTypesStrings.ArrayPattern
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ArrayPattern")
@js.native
object ArrayPattern extends TopLevel[Type[ArrayPattern]]

