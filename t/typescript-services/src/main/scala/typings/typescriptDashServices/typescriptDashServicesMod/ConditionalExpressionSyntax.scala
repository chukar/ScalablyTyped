package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConditionalExpressionSyntax")
@js.native
class ConditionalExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ConditionalExpressionSyntax {
  def this(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ConditionalExpressionSyntax")
@js.native
object ConditionalExpressionSyntax extends js.Object {
  def create1(condition: IExpressionSyntax, whenTrue: IExpressionSyntax, whenFalse: IExpressionSyntax): typings.typescriptDashServices.TypeScript.ConditionalExpressionSyntax = js.native
}

