package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicsDetectionJobFilter extends js.Object {
  /**
    * 
    */
  var JobName: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobName] = js.native
  /**
    * Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
    */
  var JobStatus: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobStatus] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeBefore: js.UndefOr[Timestamp] = js.native
}

object TopicsDetectionJobFilter {
  @scala.inline
  def apply(
    JobName: JobName = null,
    JobStatus: JobStatus = null,
    SubmitTimeAfter: Timestamp = null,
    SubmitTimeBefore: Timestamp = null
  ): TopicsDetectionJobFilter = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (SubmitTimeAfter != null) __obj.updateDynamic("SubmitTimeAfter")(SubmitTimeAfter.asInstanceOf[js.Any])
    if (SubmitTimeBefore != null) __obj.updateDynamic("SubmitTimeBefore")(SubmitTimeBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicsDetectionJobFilter]
  }
}

