package typings.atAngularCompiler.srcInjectableUnderscoreCompilerUnderscore2Mod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectableDef extends js.Object {
  var expression: Expression
  var statements: js.Array[Statement]
  var `type`: Type
}

object InjectableDef {
  @scala.inline
  def apply(expression: Expression, statements: js.Array[Statement], `type`: Type): InjectableDef = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableDef]
  }
}

