package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb", "DB")
@js.native
abstract class DB () extends js.Object {
  var disableSubscribe: Boolean = js.native
  var projectsSnapshots: Boolean = js.native
  @JSName("query")
  var query_Original: DBQueryMethod = js.native
  def canPollDoc(): Boolean = js.native
  def close(): Unit = js.native
  def close(callback: BasicCallback): Unit = js.native
  def commit(
    collection: String,
    id: String,
    op: Op,
    snapshot: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def getCommittedOpVersion(
    collection: String,
    id: String,
    snapshot: js.Any,
    op: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def getOps(
    collection: String,
    id: String,
    from: Double,
    to: Double,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def getOpsBulk(
    collection: String,
    fromMap: js.Any,
    toMap: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def getOpsToSnapshot(
    collection: String,
    id: String,
    from: Double,
    snapshot: Double,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def getSnapshot(
    collection: String,
    id: String,
    fields: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def getSnapshotBulk(
    collection: String,
    ids: String,
    fields: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def query(
    collection: String,
    query: js.Any,
    fields: js.UndefOr[scala.Nothing],
    options: js.Any,
    callback: DBQueryCallback
  ): Unit = js.native
  def query(
    collection: String,
    query: js.Any,
    fields: ProjectionFields,
    options: js.Any,
    callback: DBQueryCallback
  ): Unit = js.native
  def queryPoll(
    collection: String,
    query: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def queryPollDoc(
    collection: String,
    id: String,
    query: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def skipPoll(): Boolean = js.native
}

