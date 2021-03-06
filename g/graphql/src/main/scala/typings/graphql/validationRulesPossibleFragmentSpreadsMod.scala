package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/PossibleFragmentSpreads", JSImport.Namespace)
@js.native
object validationRulesPossibleFragmentSpreadsMod extends js.Object {
  def PossibleFragmentSpreads(context: ValidationContext): ASTVisitor = js.native
  def typeIncompatibleAnonSpreadMessage(parentType: String, fragType: String): String = js.native
  def typeIncompatibleSpreadMessage(fragName: String, parentType: String, fragType: String): String = js.native
}

