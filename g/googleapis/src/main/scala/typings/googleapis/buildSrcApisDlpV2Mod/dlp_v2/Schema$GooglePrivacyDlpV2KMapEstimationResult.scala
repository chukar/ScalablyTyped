package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the reidentifiability analysis. Note that these results are an
  * estimation, not exact values.
  */
@js.native
trait Schema$GooglePrivacyDlpV2KMapEstimationResult extends js.Object {
  /**
    * The intervals [min_anonymity, max_anonymity] do not overlap. If a value
    * doesn&#39;t correspond to any such interval, the associated frequency is
    * zero. For example, the following records:   {min_anonymity: 1,
    * max_anonymity: 1, frequency: 17}   {min_anonymity: 2, max_anonymity: 3,
    * frequency: 42}   {min_anonymity: 5, max_anonymity: 10, frequency: 99}
    * mean that there are no record with an estimated anonymity of 4, 5, or
    * larger than 10.
    */
  var kMapEstimationHistogram: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2KMapEstimationHistogramBucket]] = js.native
}

object Schema$GooglePrivacyDlpV2KMapEstimationResult {
  @scala.inline
  def apply(kMapEstimationHistogram: js.Array[Schema$GooglePrivacyDlpV2KMapEstimationHistogramBucket] = null): Schema$GooglePrivacyDlpV2KMapEstimationResult = {
    val __obj = js.Dynamic.literal()
    if (kMapEstimationHistogram != null) __obj.updateDynamic("kMapEstimationHistogram")(kMapEstimationHistogram.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2KMapEstimationResult]
  }
}

