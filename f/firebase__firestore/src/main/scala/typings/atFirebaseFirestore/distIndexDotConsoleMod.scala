package typings.atFirebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAuthDashInteropDashTypes.atFirebaseAuthDashInteropDashTypesMod.FirebaseAuthInternalName
import typings.atFirebaseComponent.atFirebaseComponentMod.Provider
import typings.atFirebaseFirestore.distSrcApiDatabaseMod.FirestoreDatabase
import typings.atFirebaseFirestore.distSrcApiFieldUnderscoreValueMod.FieldValueImpl
import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import typings.atFirebaseFirestore.distSrcModelDocumentMod.Document
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typings.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.LogLevel
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/index.console", JSImport.Namespace)
@js.native
object distIndexDotConsoleMod extends js.Object {
  @js.native
  class Blob ()
    extends typings.atFirebaseFirestore.distSrcApiBlobMod.Blob
  
  @js.native
  class DocumentReference[T] protected ()
    extends typings.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[T] {
    def this(_key: DocumentKey, firestore: typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore) = this()
    def this(
      _key: DocumentKey,
      firestore: typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore,
      _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ _]
    ) = this()
  }
  
  @js.native
  class FieldPath protected ()
    extends typings.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  @js.native
  class FieldValue protected () extends FieldValueImpl {
    def this(_methodName: String) = this()
  }
  
  @js.native
  class Firestore protected ()
    extends typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore {
    def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  }
  
  @js.native
  class GeoPoint protected ()
    extends typings.atFirebaseFirestore.distSrcApiGeoUnderscorePointMod.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @js.native
  class Timestamp protected ()
    extends typings.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp {
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  
  val CollectionReference: Instantiable3[
    /* _path */ ResourcePath, 
    /* firestore */ typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typings.atFirebaseFirestore.distSrcApiDatabaseMod.CollectionReference[js.Object]
  ] = js.native
  val DocumentSnapshot: Instantiable6[
    /* _firestore */ typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
    /* _key */ DocumentKey, 
    /* _document */ Document | Null, 
    /* _fromCache */ Boolean, 
    /* _hasPendingWrites */ Boolean, 
    js.UndefOr[
      FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typings.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentSnapshot[js.Object]
  ] = js.native
  val QuerySnapshot: Instantiable4[
    /* _firestore */ typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
    /* _originalQuery */ Query, 
    /* _snapshot */ ViewSnapshot, 
    js.UndefOr[
      FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typings.atFirebaseFirestore.distSrcApiDatabaseMod.QuerySnapshot[js.Object]
  ] = js.native
  @js.native
  object Blob
    extends Instantiable0[typings.atFirebaseFirestore.distSrcApiBlobMod.Blob] {
    def fromBase64String(base64: String): typings.atFirebaseFirestore.distSrcApiBlobMod.Blob = js.native
    def fromUint8Array(array: Uint8Array): typings.atFirebaseFirestore.distSrcApiBlobMod.Blob = js.native
  }
  
  @js.native
  object DocumentReference
    extends Instantiable2[
          /* _key */ DocumentKey, 
          /* firestore */ typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
          typings.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[js.Object]
        ]
       with Instantiable3[
          /* _key */ DocumentKey, 
          /* firestore */ typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          typings.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[js.Object]
        ] {
    def forPath[U](path: ResourcePath, firestore: typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore): typings.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[U] = js.native
    def forPath[U](
      path: ResourcePath,
      firestore: typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typings.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[U] = js.native
  }
  
  /* static members */
  @js.native
  object FieldPath extends js.Object {
    /**
      * Internal Note: The backend doesn't technically support querying by
      * document ID. Instead it queries by the entire document name (full path
      * included), but in the cases we currently support documentId(), the net
      * effect is the same.
      */
    val _DOCUMENT_ID: js.Any = js.native
    def documentId(): typings.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath = js.native
  }
  
  @js.native
  object FieldValue extends Instantiable1[/* _methodName */ String, FieldValueImpl] {
    def arrayRemove(elements: js.Any*): FieldValueImpl = js.native
    def arrayUnion(elements: js.Any*): FieldValueImpl = js.native
    def delete(): FieldValueImpl = js.native
    def increment(n: Double): FieldValueImpl = js.native
    def serverTimestamp(): FieldValueImpl = js.native
  }
  
  /* static members */
  @js.native
  object Firestore extends js.Object {
    var databaseIdFromApp: js.Any = js.native
    def logLevel(): LogLevel = js.native
    def setLogLevel(level: LogLevel): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Timestamp extends js.Object {
    def fromDate(date: Date): typings.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp = js.native
    def fromMillis(milliseconds: Double): typings.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp = js.native
    def now(): typings.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp = js.native
  }
  
}

