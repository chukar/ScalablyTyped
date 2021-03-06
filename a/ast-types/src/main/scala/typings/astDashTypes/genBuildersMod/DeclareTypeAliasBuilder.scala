package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIdLocRight
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareTypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareTypeAliasBuilder extends js.Object {
  def apply(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): DeclareTypeAlias = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): DeclareTypeAlias = js.native
  def from(params: Anon_CommentsIdLocRight): DeclareTypeAlias = js.native
}

