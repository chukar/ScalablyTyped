package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.CommonJS
import typings.atBabelTypes.atBabelTypesStrings.ES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait DeclareModule
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var body: BlockStatement
  var id: Identifier | StringLiteral
  var kind: CommonJS | ES | Null
  @JSName("type")
  var type_DeclareModule: typings.atBabelTypes.atBabelTypesStrings.DeclareModule
}

object DeclareModule {
  @scala.inline
  def apply(
    body: BlockStatement,
    id: Identifier | StringLiteral,
    `type`: typings.atBabelTypes.atBabelTypesStrings.DeclareModule,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    kind: CommonJS | ES = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareModule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModule]
  }
}

@JSImport("@babel/types", "declareModule")
@js.native
object declareModule extends js.Object {
  def apply(id: Identifier, body: BlockStatement): DeclareModule = js.native
  def apply(id: StringLiteral, body: BlockStatement): DeclareModule = js.native
}

