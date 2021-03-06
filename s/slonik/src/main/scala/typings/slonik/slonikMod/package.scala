package typings.slonik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slonikMod {
  import typings.node.streamMod.Readable
  import typings.slonik.Anon_Connect
  import typings.slonik.Anon_Database
  import typings.slonik.Anon_Handler
  import typings.slonik.Anon_HandlerSql
  import typings.std.Parameters
  import typings.std.Record

  type ClientConfigurationInputType = ClientConfigurationType
  type ConnectionRoutineType[T] = js.Function1[/* connection */ DatabasePoolConnectionType, js.Promise[T]]
  type DatabaseConfigurationType = String | Anon_Database
  type DatabaseConnectionType = DatabasePoolConnectionType with DatabasePoolType
  type DatabasePoolConnectionType = CommonQueryMethodsType with Anon_HandlerSql
  type DatabasePoolType = CommonQueryMethodsType with Anon_Connect
  type DatabaseTransactionConnectionType = CommonQueryMethodsType with Anon_Handler
  type IdentifierNormalizerType = js.Function1[/* identifierName */ String, String]
  type LoggerType = js.Function1[/* repeated */ String, scala.Nothing]
  type MaybePromiseType[T] = T | js.Promise[T]
  type NamedAssignmentType = Record[String, ValueExpressionType]
  type NamedParameterValuesType = Record[String, ValueExpressionType]
  type PrimitiveValueExpressionType = String | Double | Boolean | Null | PrimitiveValueExpressionTypeArray
  type QueryAnyFirstFunctionType = js.Function1[
    /* args */ QueryMethodParams[js.Any], 
    js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ]
  ]
  type QueryAnyFunctionType = js.Function1[/* args */ QueryMethodParams[js.Any], js.Promise[js.Array[js.Any]]]
  type QueryFunctionType = js.Function1[/* args */ QueryMethodParams[js.Any], js.Promise[QueryResultType[js.Any]]]
  type QueryIdType = String
  type QueryManyFirstFunctionType = QueryAnyFirstFunctionType
  type QueryManyFunctionType = QueryAnyFunctionType
  type QueryMaybeOneFirstFunctionType = js.Function1[
    /* args */ QueryMethodParams[js.Any], 
    js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
    ]
  ]
  type QueryMaybeOneFunctionType = js.Function1[/* args */ QueryMethodParams[js.Any], js.Promise[js.Any | Null]]
  type QueryMethodParams[T] = Parameters[QueryMethodType[T, scala.Nothing]]
  type QueryMethodType[RowType, Result] = js.Function2[
    /* sql */ TaggedTemplateLiteralInvocationType[RowType], 
    /* values */ js.UndefOr[js.Array[PrimitiveValueExpressionType]], 
    js.Promise[Result]
  ]
  type QueryOneFirstFunctionType = js.Function1[
    /* args */ QueryMethodParams[js.Any], 
    js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]
  type QueryOneFunctionType = js.Function1[/* args */ QueryMethodParams[js.Any], js.Promise[js.Any]]
  type QueryResultRowColumnType = String | Double
  type QueryResultRowType[ColumnName /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in ColumnName ]: slonik.slonik.QueryResultRowColumnType}
    */ typings.slonik.slonikStrings.QueryResultRowType with js.Any
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - js.Object
    - typings.slonik.slonikMod.SerializableValueObject
    - typings.slonik.slonikMod.SerializableValueArray
  */
  type SerializableValueType = _SerializableValueType | String | Double | Boolean | Null | js.Object
  type SqlSqlTokenType[T] = TaggedTemplateLiteralInvocationType[T]
  /* Rewritten from type alias, can be one of: 
    - typings.slonik.slonikMod.ArraySqlTokenType
    - typings.slonik.slonikMod.BinarySqlTokenType
    - typings.slonik.slonikMod.IdentifierSqlTokenType
    - typings.slonik.slonikMod.JsonSqlTokenType
    - typings.slonik.slonikMod.ListSqlTokenType
    - typings.slonik.slonikMod.SqlSqlTokenType[js.Any]
    - typings.slonik.slonikMod.UnnestSqlTokenType
  */
  type SqlTokenType = _SqlTokenType | SqlSqlTokenType[js.Any]
  type StreamHandlerType = js.Function1[/* stream */ Readable, Unit]
  type TransactionFunctionType[T] = js.Function1[/* connection */ DatabaseTransactionConnectionType, js.Promise[T]]
  type ValueExpressionType = SqlTokenType | PrimitiveValueExpressionType
}
