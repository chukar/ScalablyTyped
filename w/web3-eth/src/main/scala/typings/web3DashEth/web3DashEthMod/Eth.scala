package typings.web3DashEth.web3DashEthMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.bignumberDotJs.bignumberDotJsMod.BigNumber
import typings.bnDotJs.bnDotJsMod.^
import typings.node.netMod.Socket
import typings.std.Error
import typings.web3DashCore.web3DashCoreMod.BlockNumber
import typings.web3DashCore.web3DashCoreMod.Common
import typings.web3DashCore.web3DashCoreMod.Extension
import typings.web3DashCore.web3DashCoreMod.Log
import typings.web3DashCore.web3DashCoreMod.LogsOptions
import typings.web3DashCore.web3DashCoreMod.PastLogsOptions
import typings.web3DashCore.web3DashCoreMod.PromiEvent
import typings.web3DashCore.web3DashCoreMod.Providers
import typings.web3DashCore.web3DashCoreMod.RLPEncodedTransaction
import typings.web3DashCore.web3DashCoreMod.Transaction
import typings.web3DashCore.web3DashCoreMod.TransactionConfig
import typings.web3DashCore.web3DashCoreMod.TransactionReceipt
import typings.web3DashCore.web3DashCoreMod.chain
import typings.web3DashCore.web3DashCoreMod.hardfork
import typings.web3DashCore.web3DashCoreMod.provider
import typings.web3DashCoreDashSubscriptions.web3DashCoreDashSubscriptionsMod.Subscription
import typings.web3DashEth.web3DashEthBooleans.`true`
import typings.web3DashEth.web3DashEthStrings.logs
import typings.web3DashEth.web3DashEthStrings.newBlockHeaders
import typings.web3DashEth.web3DashEthStrings.pendingTransactions
import typings.web3DashEth.web3DashEthStrings.syncing
import typings.web3DashEthDashAbi.web3DashEthDashAbiMod.AbiCoder
import typings.web3DashEthDashAccounts.web3DashEthDashAccountsMod.Accounts
import typings.web3DashEthDashContract.web3DashEthDashContractMod.ContractOptions
import typings.web3DashEthDashEns.web3DashEthDashEnsMod.Ens
import typings.web3DashEthDashPersonal.web3DashEthDashPersonalMod.Personal
import typings.web3DashNet.web3DashNetMod.Network
import typings.web3DashUtils.web3DashUtilsMod.AbiItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth", "Eth")
@js.native
class Eth () extends js.Object {
  def this(provider: provider) = this()
  def this(provider: provider, net: Socket) = this()
  var BatchRequest: Instantiable0[typings.web3DashCore.web3DashCoreMod.BatchRequest] = js.native
  var Contract: Instantiable3[
    /* jsonInterface */ js.Array[AbiItem] | AbiItem, 
    js.UndefOr[/* address */ String], 
    js.UndefOr[/* options */ ContractOptions], 
    typings.web3DashEthDashContract.web3DashEthDashContractMod.Contract
  ] = js.native
  var Iban: Instantiable1[/* iban */ String, typings.web3DashEthDashIban.web3DashEthDashIbanMod.Iban] = js.native
  var abi: AbiCoder = js.native
  var accounts: Accounts = js.native
  val currentProvider: provider = js.native
  var defaultAccount: String | Null = js.native
  var defaultBlock: String | Double = js.native
  var defaultChain: chain = js.native
  var defaultCommon: Common = js.native
  var defaultHardfork: hardfork = js.native
  var ens: Ens = js.native
  val givenProvider: js.Any = js.native
  var net: Network = js.native
  var personal: Personal = js.native
  var transactionBlockTimeout: Double = js.native
  var transactionConfirmationBlocks: Double = js.native
  var transactionPollingTimeout: Double = js.native
  def call(transactionConfig: TransactionConfig): js.Promise[String] = js.native
  def call(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ Error, /* data */ String, Unit]
  ): js.Promise[String] = js.native
  def call(transactionConfig: TransactionConfig, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def call(
    transactionConfig: TransactionConfig,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ Error, /* data */ String, Unit]
  ): js.Promise[String] = js.native
  def clearSubscriptions(callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): Unit = js.native
  def estimateGas(transactionConfig: TransactionConfig): js.Promise[Double] = js.native
  def estimateGas(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ Error, /* gas */ Double, Unit]
  ): js.Promise[Double] = js.native
  def extend(extension: Extension): js.Any = js.native
  def getAccounts(): js.Promise[js.Array[String]] = js.native
  def getAccounts(callback: js.Function2[/* error */ Error, /* accounts */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
  def getBalance(address: String): js.Promise[String] = js.native
  def getBalance(address: String, callback: js.Function2[/* error */ Error, /* balance */ String, Unit]): js.Promise[String] = js.native
  def getBalance(address: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getBalance(
    address: String,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ Error, /* balance */ String, Unit]
  ): js.Promise[String] = js.native
  def getBlock(blockHashOrBlockNumber: String): js.Promise[BlockTransactionString] = js.native
  def getBlock(
    blockHashOrBlockNumber: String,
    callback: js.Function2[/* error */ Error, /* block */ BlockTransactionString, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getBlock(blockHashOrBlockNumber: BlockNumber): js.Promise[BlockTransactionString] = js.native
  def getBlock(
    blockHashOrBlockNumber: BlockNumber,
    callback: js.Function2[/* error */ Error, /* block */ BlockTransactionString, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getBlockNumber(): js.Promise[Double] = js.native
  def getBlockNumber(callback: js.Function2[/* error */ Error, /* blockNumber */ Double, Unit]): js.Promise[Double] = js.native
  def getBlockTransactionCount(blockHashOrBlockNumber: String): js.Promise[Double] = js.native
  def getBlockTransactionCount(
    blockHashOrBlockNumber: String,
    callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getBlockTransactionCount(blockHashOrBlockNumber: BlockNumber): js.Promise[Double] = js.native
  def getBlockTransactionCount(
    blockHashOrBlockNumber: BlockNumber,
    callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getBlockUncleCount(blockHashOrBlockNumber: String): js.Promise[Double] = js.native
  def getBlockUncleCount(
    blockHashOrBlockNumber: String,
    callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getBlockUncleCount(blockHashOrBlockNumber: BlockNumber): js.Promise[Double] = js.native
  def getBlockUncleCount(
    blockHashOrBlockNumber: BlockNumber,
    callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  @JSName("getBlock")
  def getBlock_true(blockHashOrBlockNumber: String, returnTransactionObjects: `true`): js.Promise[BlockTransactionObject] = js.native
  @JSName("getBlock")
  def getBlock_true(
    blockHashOrBlockNumber: String,
    returnTransactionObjects: `true`,
    callback: js.Function2[/* error */ Error, /* block */ BlockTransactionObject, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  @JSName("getBlock")
  def getBlock_true(blockHashOrBlockNumber: BlockNumber, returnTransactionObjects: `true`): js.Promise[BlockTransactionObject] = js.native
  @JSName("getBlock")
  def getBlock_true(
    blockHashOrBlockNumber: BlockNumber,
    returnTransactionObjects: `true`,
    callback: js.Function2[/* error */ Error, /* block */ BlockTransactionObject, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  def getChainId(): js.Promise[Double] = js.native
  def getChainId(callback: js.Function2[/* error */ Error, /* version */ Double, Unit]): js.Promise[Double] = js.native
  def getCode(address: String): js.Promise[String] = js.native
  def getCode(address: String, callback: js.Function2[/* error */ Error, /* code */ String, Unit]): js.Promise[String] = js.native
  def getCode(address: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getCode(
    address: String,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ Error, /* code */ String, Unit]
  ): js.Promise[String] = js.native
  def getCoinbase(): js.Promise[String] = js.native
  def getCoinbase(callback: js.Function2[/* error */ Error, /* coinbaseAddress */ String, Unit]): js.Promise[String] = js.native
  def getGasPrice(): js.Promise[String] = js.native
  def getGasPrice(callback: js.Function2[/* error */ Error, /* gasPrice */ String, Unit]): js.Promise[String] = js.native
  def getHashrate(): js.Promise[Double] = js.native
  def getHashrate(callback: js.Function2[/* error */ Error, /* hashes */ Double, Unit]): js.Promise[Double] = js.native
  def getNodeInfo(): js.Promise[String] = js.native
  def getNodeInfo(callback: js.Function2[/* error */ Error, /* version */ String, Unit]): js.Promise[String] = js.native
  def getPastLogs(options: PastLogsOptions): js.Promise[js.Array[Log]] = js.native
  def getPastLogs(
    options: PastLogsOptions,
    callback: js.Function2[/* error */ Error, /* logs */ js.Array[Log], Unit]
  ): js.Promise[js.Array[Log]] = js.native
  def getPendingTransactions(): js.Promise[js.Array[Transaction]] = js.native
  def getPendingTransactions(callback: js.Function2[/* error */ Error, /* result */ js.Array[Transaction], Unit]): js.Promise[js.Array[Transaction]] = js.native
  def getProof(address: String, storageKey: js.Array[String], blockNumber: BlockNumber): js.Promise[GetProof] = js.native
  def getProof(
    address: String,
    storageKey: js.Array[String],
    blockNumber: BlockNumber,
    callback: js.Function2[/* error */ Error, /* result */ GetProof, Unit]
  ): js.Promise[GetProof] = js.native
  def getProtocolVersion(): js.Promise[String] = js.native
  def getProtocolVersion(callback: js.Function2[/* error */ Error, /* protocolVersion */ String, Unit]): js.Promise[String] = js.native
  def getStorageAt(address: String, position: String): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: String,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: String,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: Double,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: Double,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: BigNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: BigNumber,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: BigNumber, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: BigNumber,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: ^): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: ^,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: ^, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: ^,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getTransaction(transactionHash: String): js.Promise[Transaction] = js.native
  def getTransaction(
    transactionHash: String,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionCount(address: String): js.Promise[Double] = js.native
  def getTransactionCount(address: String, callback: js.Function2[/* error */ Error, /* count */ Double, Unit]): js.Promise[Double] = js.native
  def getTransactionCount(address: String, defaultBlock: BlockNumber): js.Promise[Double] = js.native
  def getTransactionCount(
    address: String,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ Error, /* count */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: String): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: String,
    indexNumber: String,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: Double): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: String,
    indexNumber: Double,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: ^): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: String,
    indexNumber: ^,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: String): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: BlockNumber,
    indexNumber: String,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: Double): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: BlockNumber,
    indexNumber: Double,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: ^): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: BlockNumber,
    indexNumber: ^,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionReceipt(hash: String): js.Promise[TransactionReceipt] = js.native
  def getTransactionReceipt(
    hash: String,
    callback: js.Function2[/* error */ Error, /* transactionReceipt */ TransactionReceipt, Unit]
  ): js.Promise[TransactionReceipt] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: String): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: String,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: Double,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: ^): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: ^,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: String): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: String,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: Double): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: Double,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: ^): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: ^,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  @JSName("getUncle")
  def getUncle_true(blockHashOrBlockNumber: String, uncleIndex: String, returnTransactionObjects: `true`): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(
    blockHashOrBlockNumber: String,
    uncleIndex: String,
    returnTransactionObjects: `true`,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(blockHashOrBlockNumber: String, uncleIndex: Double, returnTransactionObjects: `true`): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(
    blockHashOrBlockNumber: String,
    uncleIndex: Double,
    returnTransactionObjects: `true`,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(blockHashOrBlockNumber: String, uncleIndex: ^, returnTransactionObjects: `true`): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(
    blockHashOrBlockNumber: String,
    uncleIndex: ^,
    returnTransactionObjects: `true`,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(blockHashOrBlockNumber: BlockNumber, uncleIndex: String, returnTransactionObjects: `true`): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: String,
    returnTransactionObjects: `true`,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(blockHashOrBlockNumber: BlockNumber, uncleIndex: Double, returnTransactionObjects: `true`): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: Double,
    returnTransactionObjects: `true`,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(blockHashOrBlockNumber: BlockNumber, uncleIndex: ^, returnTransactionObjects: `true`): js.Promise[BlockTransactionObject] = js.native
  @JSName("getUncle")
  def getUncle_true(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: ^,
    returnTransactionObjects: `true`,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  def getWork(): js.Promise[js.Array[String]] = js.native
  def getWork(callback: js.Function2[/* error */ Error, /* result */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
  def isMining(): js.Promise[Boolean] = js.native
  def isMining(callback: js.Function2[/* error */ Error, /* mining */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def isSyncing(): js.Promise[Syncing | Boolean] = js.native
  def isSyncing(callback: js.Function2[/* error */ Error, /* syncing */ Syncing, Unit]): js.Promise[Syncing | Boolean] = js.native
  def sendSignedTransaction(signedTransactionData: String): PromiEvent[TransactionReceipt] = js.native
  def sendSignedTransaction(signedTransactionData: String, callback: js.Function2[/* error */ Error, /* hash */ String, Unit]): PromiEvent[TransactionReceipt] = js.native
  def sendTransaction(transactionConfig: TransactionConfig): PromiEvent[TransactionReceipt] = js.native
  def sendTransaction(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ Error, /* hash */ String, Unit]
  ): PromiEvent[TransactionReceipt] = js.native
  def setProvider(provider: provider): Boolean = js.native
  def sign(dataToSign: String, address: String): js.Promise[String] = js.native
  def sign(
    dataToSign: String,
    address: String,
    callback: js.Function2[/* error */ Error, /* signature */ String, Unit]
  ): js.Promise[String] = js.native
  def sign(dataToSign: String, address: Double): js.Promise[String] = js.native
  def sign(
    dataToSign: String,
    address: Double,
    callback: js.Function2[/* error */ Error, /* signature */ String, Unit]
  ): js.Promise[String] = js.native
  def signTransaction(transactionConfig: TransactionConfig): js.Promise[RLPEncodedTransaction] = js.native
  def signTransaction(transactionConfig: TransactionConfig, address: String): js.Promise[RLPEncodedTransaction] = js.native
  def signTransaction(
    transactionConfig: TransactionConfig,
    address: String,
    callback: js.Function2[/* error */ Error, /* signedTransaction */ RLPEncodedTransaction, Unit]
  ): js.Promise[RLPEncodedTransaction] = js.native
  def signTransaction(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ Error, /* signedTransaction */ RLPEncodedTransaction, Unit]
  ): js.Promise[RLPEncodedTransaction] = js.native
  def submitWork(data: js.Tuple3[String, String, String]): js.Promise[Boolean] = js.native
  def submitWork(
    data: js.Tuple3[String, String, String],
    callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]
  ): js.Promise[Boolean] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: logs, options: LogsOptions): Subscription[Log] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: logs, options: LogsOptions, callback: js.Function2[/* error */ Error, /* log */ Log, Unit]): Subscription[Log] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: newBlockHeaders): Subscription[BlockHeader] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(
    `type`: newBlockHeaders,
    callback: js.Function2[/* error */ Error, /* blockHeader */ BlockHeader, Unit]
  ): Subscription[BlockHeader] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: pendingTransactions): Subscription[String] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(
    `type`: pendingTransactions,
    callback: js.Function2[/* error */ Error, /* transactionHash */ String, Unit]
  ): Subscription[String] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing): Subscription[Syncing] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing, callback: js.Function2[/* error */ Error, /* result */ Syncing, Unit]): Subscription[Syncing] = js.native
}

/* static members */
@JSImport("web3-eth", "Eth")
@js.native
object Eth extends js.Object {
  val givenProvider: js.Any = js.native
  val providers: Providers = js.native
}

