package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ArrayPatternKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.ObjectPatternKind
import typings.astDashTypes.genKindsMod.RestElementKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSFunctionType
  extends TSHasOptionalTypeParameters
     with TSHasOptionalTypeAnnotation
     with ASTNode {
  var parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TSFunctionType
}

object TSFunctionType {
  @scala.inline
  def apply(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astDashTypes.astDashTypesStrings.TSFunctionType,
    typeAnnotation: TSTypeAnnotationKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSFunctionType]
  }
}

