package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSelectObjectContentEventStreamMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreContinuationEventMod._UnmarshalledContinuationEvent
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreEndEventMod._UnmarshalledEndEvent
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreProgressEventMod._UnmarshalledProgressEvent
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRecordsEventMod._UnmarshalledRecordsEvent
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStatsEventMod._UnmarshalledStatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSelectObjectContentEventStream extends _SelectObjectContentEventStream {
  /**
    * <p>The Continuation Event.</p>
    */
  @JSName("Cont")
  var Cont__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledContinuationEvent] = js.undefined
  /**
    * <p>The End Event.</p>
    */
  @JSName("End")
  var End__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledEndEvent] = js.undefined
  /**
    * <p>The Progress Event.</p>
    */
  @JSName("Progress")
  var Progress__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledProgressEvent] = js.undefined
  /**
    * <p>The Records Event.</p>
    */
  @JSName("Records")
  var Records__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledRecordsEvent] = js.undefined
  /**
    * <p>The Stats Event.</p>
    */
  @JSName("Stats")
  var Stats__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledStatsEvent] = js.undefined
}

object _UnmarshalledSelectObjectContentEventStream {
  @scala.inline
  def apply(
    Cont: _UnmarshalledContinuationEvent = null,
    End: _UnmarshalledEndEvent = null,
    Progress: _UnmarshalledProgressEvent = null,
    Records: _UnmarshalledRecordsEvent = null,
    Stats: _UnmarshalledStatsEvent = null
  ): _UnmarshalledSelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    if (Cont != null) __obj.updateDynamic("Cont")(Cont.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (Records != null) __obj.updateDynamic("Records")(Records.asInstanceOf[js.Any])
    if (Stats != null) __obj.updateDynamic("Stats")(Stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSelectObjectContentEventStream]
  }
}

