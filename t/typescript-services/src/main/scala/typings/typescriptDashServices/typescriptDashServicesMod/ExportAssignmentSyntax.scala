package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ExportAssignmentSyntax")
@js.native
class ExportAssignmentSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ExportAssignmentSyntax {
  def this(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ExportAssignmentSyntax")
@js.native
object ExportAssignmentSyntax extends js.Object {
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScript.ExportAssignmentSyntax = js.native
}

