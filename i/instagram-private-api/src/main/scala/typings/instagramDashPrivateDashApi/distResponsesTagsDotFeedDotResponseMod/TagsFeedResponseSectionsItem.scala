package typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseSectionsItem extends js.Object {
  var explore_item_info: TagsFeedResponseExplore_item_info
  var feed_type: String
  var layout_content: TagsFeedResponseLayout_content
  var layout_type: String
}

object TagsFeedResponseSectionsItem {
  @scala.inline
  def apply(
    explore_item_info: TagsFeedResponseExplore_item_info,
    feed_type: String,
    layout_content: TagsFeedResponseLayout_content,
    layout_type: String
  ): TagsFeedResponseSectionsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagsFeedResponseSectionsItem]
  }
}

