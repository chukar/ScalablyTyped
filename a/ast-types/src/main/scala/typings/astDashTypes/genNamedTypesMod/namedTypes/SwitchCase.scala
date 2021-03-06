package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait SwitchCase
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var consequent: js.Array[StatementKind]
  var test: ExpressionKind | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.SwitchCase
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.SwitchCase")
@js.native
object SwitchCase extends TopLevel[Type[SwitchCase]]

