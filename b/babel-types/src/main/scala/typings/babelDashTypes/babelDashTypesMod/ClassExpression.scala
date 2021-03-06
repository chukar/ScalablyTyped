package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassExpression
  extends Node
     with Class
     with Expression
     with Pureish
     with Scopable {
  var body: ClassBody
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var id: Identifier
  var implements: js.UndefOr[js.Array[ClassImplements]] = js.undefined
  var mixins: js.UndefOr[js.Array[_]] = js.undefined
  var superClass: Expression
  var superTypeParameters: js.UndefOr[TypeParameterInstantiation] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ClassExpression: typings.babelDashTypes.babelDashTypesStrings.ClassExpression
}

object ClassExpression {
  @scala.inline
  def apply(
    body: ClassBody,
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    superClass: Expression,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ClassExpression,
    decorators: js.Array[Decorator] = null,
    implements: js.Array[ClassImplements] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    mixins: js.Array[_] = null,
    superTypeParameters: TypeParameterInstantiation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (implements != null) __obj.updateDynamic("implements")(implements.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression]
  }
}

@JSImport("babel-types", "classExpression")
@js.native
object classExpression extends js.Object {
  def apply(): ClassExpression = js.native
  def apply(id: Identifier): ClassExpression = js.native
  def apply(id: Identifier, superClass: Expression): ClassExpression = js.native
  def apply(id: Identifier, superClass: Expression, body: ClassBody): ClassExpression = js.native
  def apply(id: Identifier, superClass: Expression, body: ClassBody, decorators: js.Array[Decorator]): ClassExpression = js.native
}

