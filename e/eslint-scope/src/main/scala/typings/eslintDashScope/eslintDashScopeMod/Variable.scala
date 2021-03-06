package typings.eslintDashScope.eslintDashScopeMod

import typings.eslint.eslintMod.Scope.Definition
import typings.estree.estreeMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "Variable")
@js.native
class Variable ()
  extends typings.eslint.eslintMod.Scope.Variable {
  /* CompleteClass */
  override var defs: js.Array[Definition] = js.native
  /* CompleteClass */
  override var identifiers: js.Array[Identifier] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var references: js.Array[typings.eslint.eslintMod.Scope.Reference] = js.native
}

