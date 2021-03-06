package typings.yaml.yamlMod.ast

import typings.yaml.yamlStrings.FLOW_SEQ
import typings.yaml.yamlStrings.SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeqBase extends Node {
  /**
    * item is always Node or null when parsed, but can be set to anything.
    */
  var items: js.Array[AstNode | Pair | Null]
  var `type`: js.UndefOr[FLOW_SEQ | SEQ] = js.undefined
}

object SeqBase {
  @scala.inline
  def apply(
    items: js.Array[AstNode | Pair | Null],
    toJSON: () => js.Any,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cst.Node = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    `type`: FLOW_SEQ | SEQ = null
  ): SeqBase = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqBase]
  }
}

