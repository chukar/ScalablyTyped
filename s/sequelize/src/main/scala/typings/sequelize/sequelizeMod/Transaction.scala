package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Transaction
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/transaction.js
//
/**
  * The transaction object is used to identify a running transaction. It is created by calling
  * `Sequelize.transaction()`.
  *
  * To run a query under a transaction, you should pass the transaction in the options object.
  */
trait Transaction extends js.Object {
  /**
    * Possible options for row locking. Used in conjuction with `find` calls:
    *
    * @see TransactionStatic
    */
  var LOCK: TransactionLock
  /**
    * Commit the transaction
    */
  def commit(): typings.bluebird.bluebirdMod.^[Unit]
  /**
    * Rollback (abort) the transaction
    */
  def rollback(): typings.bluebird.bluebirdMod.^[Unit]
}

object Transaction {
  @scala.inline
  def apply(
    LOCK: TransactionLock,
    commit: () => typings.bluebird.bluebirdMod.^[Unit],
    rollback: () => typings.bluebird.bluebirdMod.^[Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(LOCK = LOCK.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), rollback = js.Any.fromFunction0(rollback))
  
    __obj.asInstanceOf[Transaction]
  }
}

