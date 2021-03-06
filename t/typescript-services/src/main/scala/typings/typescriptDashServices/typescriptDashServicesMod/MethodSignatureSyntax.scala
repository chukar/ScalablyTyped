package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MethodSignatureSyntax")
@js.native
class MethodSignatureSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.MethodSignatureSyntax {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MethodSignatureSyntax")
@js.native
object MethodSignatureSyntax extends js.Object {
  def create(
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptDashServices.TypeScript.MethodSignatureSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptDashServices.TypeScript.MethodSignatureSyntax = js.native
}

