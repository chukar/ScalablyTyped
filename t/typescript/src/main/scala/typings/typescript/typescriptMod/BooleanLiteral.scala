package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.FalseKeyword
import typings.typescript.typescriptMod.SyntaxKind.TrueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand */ @js.native
trait BooleanLiteral extends PrimaryExpression {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_BooleanLiteral: TrueKeyword | FalseKeyword = js.native
}

