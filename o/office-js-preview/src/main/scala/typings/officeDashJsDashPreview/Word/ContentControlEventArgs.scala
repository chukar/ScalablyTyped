package typings.officeDashJsDashPreview.Word

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AnnotationAdded
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AnnotationChanged
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AnnotationDeleted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ContentControlAdded
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ContentControlDataChanged
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ContentControlDeleted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ContentControlSelectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the content control that raised an event.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ContentControlEventArgs extends js.Object {
  /**
    *
    * The object that raised the event. Load this object to get its properties.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentControl: ContentControl
  /**
    *
    * The event type. See Word.EventType for details.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | AnnotationAdded | AnnotationChanged | AnnotationDeleted
}

object ContentControlEventArgs {
  @scala.inline
  def apply(
    contentControl: ContentControl,
    eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | AnnotationAdded | AnnotationChanged | AnnotationDeleted
  ): ContentControlEventArgs = {
    val __obj = js.Dynamic.literal(contentControl = contentControl.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContentControlEventArgs]
  }
}

