package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Keyframe extends js.Object {
  var keyframe: FlashFrame
  var layer: FlashLayer
  var parent: js.Any
  var timeline: FlashTimeline
}

object Anon_Keyframe {
  @scala.inline
  def apply(keyframe: FlashFrame, layer: FlashLayer, parent: js.Any, timeline: FlashTimeline): Anon_Keyframe = {
    val __obj = js.Dynamic.literal(keyframe = keyframe.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Keyframe]
  }
}

