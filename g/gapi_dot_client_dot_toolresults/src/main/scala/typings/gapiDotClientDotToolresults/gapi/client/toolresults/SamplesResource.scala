package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFieldsHistoryId
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFieldsHistoryIdKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplesResource extends js.Object {
  /**
    * Creates a batch of PerfSamples - a client can submit multiple batches of Perf Samples through repeated calls to this method in order to split up a
    * large request payload - duplicates and existing timestamp entries will be ignored. - the batch operation may partially succeed - the set of elements
    * successfully inserted is returned in the response (omits items which already existed in the database).
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing PerfSampleSeries does not exist
    */
  def batchCreate(request: Anon_AltExecutionIdFieldsHistoryId): Request[BatchCreatePerfSamplesResponse]
  /**
    * Lists the Performance Samples of a given Sample Series - The list results are sorted by timestamps ascending - The default page size is 500 samples;
    * and maximum size allowed 5000 - The response token indicates the last returned PerfSample timestamp - When the results size exceeds the page size,
    * submit a subsequent request including the page token to return the rest of the samples up to the page limit
    *
    * May return any of the following canonical error codes: - OUT_OF_RANGE - The specified request page_token is out of valid range - NOT_FOUND - The
    * containing PerfSampleSeries does not exist
    */
  def list(request: Anon_AltExecutionIdFieldsHistoryIdKey): Request[ListPerfSamplesResponse]
}

object SamplesResource {
  @scala.inline
  def apply(
    batchCreate: Anon_AltExecutionIdFieldsHistoryId => Request[BatchCreatePerfSamplesResponse],
    list: Anon_AltExecutionIdFieldsHistoryIdKey => Request[ListPerfSamplesResponse]
  ): SamplesResource = {
    val __obj = js.Dynamic.literal(batchCreate = js.Any.fromFunction1(batchCreate), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SamplesResource]
  }
}

