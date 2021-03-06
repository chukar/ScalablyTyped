package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvUpload extends BulkUpload[CsvUpload] {
  def append(row: js.Object): CsvUpload
  @JSName("apply")
  def apply(): Unit
}

object CsvUpload {
  @scala.inline
  def apply(
    append: js.Object => CsvUpload,
    apply: () => Unit,
    forCampaignManagement: () => CsvUpload,
    forOfflineConversions: () => CsvUpload,
    preview: () => Unit,
    setFileName: String => CsvUpload
  ): CsvUpload = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), apply = js.Any.fromFunction0(apply), forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
  
    __obj.asInstanceOf[CsvUpload]
  }
}

