package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesMediaDotInlineDashChildDashCommentsDotFeedDotResponseMod.MediaInlineChildCommentsFeedResponseChildCommentsItem
import typings.instagramDashPrivateDashApi.distResponsesMediaDotInlineDashChildDashCommentsDotFeedDotResponseMod.MediaInlineChildCommentsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/media.inline-child-comments.feed", JSImport.Namespace)
@js.native
object distFeedsMediaDotInlineDashChildDashCommentsDotFeedMod extends js.Object {
  @js.native
  class MediaInlineChildCommentsFeed () extends Feed[
          MediaInlineChildCommentsFeedResponseRootObject, 
          MediaInlineChildCommentsFeedResponseChildCommentsItem
        ] {
    var commentId: String = js.native
    var mediaId: String = js.native
    var nextMaxId: js.Any = js.native
    var nextMinId: js.UndefOr[js.Any] = js.native
    def request(): js.Promise[MediaInlineChildCommentsFeedResponseRootObject] = js.native
  }
  
}

