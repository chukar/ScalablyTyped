package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarJobsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. Specifies the subset of jobs to retrieve. You can filter on the
    * value of one or more attributes of the job object. For example, retrieve
    * jobs with a job identifier that starts with 'census': <p><code>gcloud
    * ml-engine jobs list --filter='jobId:census*'</code> <p>List all failed
    * jobs with names that start with 'rnn': <p><code>gcloud ml-engine jobs
    * list --filter='jobId:rnn* AND state:FAILED'</code> <p>For more examples,
    * see the guide to <a
    * href="/ml-engine/docs/tensorflow/monitor-training">monitoring jobs</a>.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional. The number of jobs to retrieve per "page" of results. If there
    * are more remaining results than this number, the response message will
    * contain a valid value in the `next_page_token` field.  The default value
    * is 20, and the maximum page size is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. A page token to request the next page of results.  You get the
    * token from the `next_page_token` field of the response from the previous
    * call.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The name of the project for which to list jobs.
    */
  var parent: js.UndefOr[String] = js.native
}

