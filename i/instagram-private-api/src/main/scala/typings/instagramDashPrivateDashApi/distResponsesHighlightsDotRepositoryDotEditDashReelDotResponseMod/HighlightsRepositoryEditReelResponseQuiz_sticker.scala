package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseQuiz_sticker extends js.Object {
  var correct_answer: Double
  var end_background_color: String
  var finished: Boolean
  var id: String
  var question: String
  var quiz_id: String
  var start_background_color: String
  var tallies: js.Array[HighlightsRepositoryEditReelResponseTalliesItem]
  var text_color: String
  var viewer_can_answer: Boolean
}

object HighlightsRepositoryEditReelResponseQuiz_sticker {
  @scala.inline
  def apply(
    correct_answer: Double,
    end_background_color: String,
    finished: Boolean,
    id: String,
    question: String,
    quiz_id: String,
    start_background_color: String,
    tallies: js.Array[HighlightsRepositoryEditReelResponseTalliesItem],
    text_color: String,
    viewer_can_answer: Boolean
  ): HighlightsRepositoryEditReelResponseQuiz_sticker = {
    val __obj = js.Dynamic.literal(correct_answer = correct_answer.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_answer = viewer_can_answer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseQuiz_sticker]
  }
}

