package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcLocalPersistenceMod.PersistenceTransaction
import typings.atFirebaseFirestore.distSrcLocalPersistenceUnderscorePromiseMod.PersistencePromise
import typings.atFirebaseFirestore.distSrcLocalRemoteUnderscoreDocumentUnderscoreChangeUnderscoreBufferMod.RemoteDocumentChangeBuffer
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentMap
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.NullableMaybeDocumentMap
import typings.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/remote_document_cache", JSImport.Namespace)
@js.native
object distSrcLocalRemoteUnderscoreDocumentUnderscoreCacheMod extends js.Object {
  @js.native
  trait RemoteDocumentCache extends js.Object {
    /**
      * Executes a query against the cached Document entries.
      *
      * Implementations may return extra documents if convenient. The results
      * should be re-filtered by the consumer before presenting them to the user.
      *
      * Cached NoDocument entries have no bearing on query results.
      *
      * @param query The query to match documents against.
      * @param sinceReadTime If not set to SnapshotVersion.MIN, return only
      *     documents that have been read since this snapshot version (exclusive).
      * @return The set of matching documents.
      */
    def getDocumentsMatchingQuery(transaction: PersistenceTransaction, query: Query, sinceReadTime: SnapshotVersion): PersistencePromise[DocumentMap] = js.native
    /**
      * Looks up a set of entries in the cache.
      *
      * @param documentKeys The keys of the entries to look up.
      * @return The cached Document or NoDocument entries indexed by key. If an entry is not cached,
      *     the corresponding key will be mapped to a null value.
      */
    def getEntries(transaction: PersistenceTransaction, documentKeys: DocumentKeySet): PersistencePromise[NullableMaybeDocumentMap] = js.native
    /**
      * Looks up an entry in the cache.
      *
      * @param documentKey The key of the entry to look up.
      * @return The cached Document or NoDocument entry, or null if we have nothing
      * cached.
      */
    def getEntry(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[MaybeDocument | Null] = js.native
    /**
      * Returns the set of documents that have changed since the specified read
      * time.
      */
    def getNewDocumentChanges(transaction: PersistenceTransaction, sinceReadTime: SnapshotVersion): PersistencePromise[Anon_ChangedDocs] = js.native
    /**
      * Get an estimate of the size of the document cache. Note that for eager
      * garbage collection, we don't track sizes so this will return 0.
      */
    def getSize(transaction: PersistenceTransaction): PersistencePromise[Double] = js.native
    /**
      * Provides access to add or update the contents of the cache. The buffer
      * handles proper size accounting for the change.
      *
      * Multi-Tab Note: This should only be called by the primary client.
      *
      * @param options.trackRemovals Whether to create sentinel entries for
      * removed documents, which allows removals to be tracked by
      * `getNewDocumentChanges()`.
      */
    def newChangeBuffer(): RemoteDocumentChangeBuffer = js.native
    def newChangeBuffer(options: Anon_TrackRemovals): RemoteDocumentChangeBuffer = js.native
  }
  
}

