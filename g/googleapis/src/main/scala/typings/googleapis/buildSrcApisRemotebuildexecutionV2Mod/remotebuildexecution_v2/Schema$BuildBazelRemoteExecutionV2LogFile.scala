package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `LogFile` is a log stored in the CAS.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2LogFile extends js.Object {
  /**
    * The digest of the log contents.
    */
  var digest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * This is a hint as to the purpose of the log, and is set to true if the
    * log is human-readable text that can be usefully displayed to a user, and
    * false otherwise. For instance, if a command-line client wishes to print
    * the server logs to the terminal for a failed action, this allows it to
    * avoid displaying a binary file.
    */
  var humanReadable: js.UndefOr[Boolean] = js.native
}

object Schema$BuildBazelRemoteExecutionV2LogFile {
  @scala.inline
  def apply(
    digest: Schema$BuildBazelRemoteExecutionV2Digest = null,
    humanReadable: js.UndefOr[Boolean] = js.undefined
  ): Schema$BuildBazelRemoteExecutionV2LogFile = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(humanReadable)) __obj.updateDynamic("humanReadable")(humanReadable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2LogFile]
  }
}

