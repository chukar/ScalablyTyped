package typings.yaml.yamlMod

import typings.yaml.yamlMod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yaml.yamlMod.YAMLSyntaxError
  - typings.yaml.yamlMod.YAMLSemanticError
  - typings.yaml.yamlMod.YAMLReferenceError
*/
trait YAMLError extends js.Object

object YAMLError {
  @scala.inline
  def YAMLSyntaxError(
    message: String,
    name: typings.yaml.yamlStrings.YAMLSyntaxError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
  @scala.inline
  def YAMLSemanticError(
    message: String,
    name: typings.yaml.yamlStrings.YAMLSemanticError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
  @scala.inline
  def YAMLReferenceError(
    message: String,
    name: typings.yaml.yamlStrings.YAMLReferenceError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
}

