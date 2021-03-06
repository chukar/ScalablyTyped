package typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod

import typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus
import typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.UpdateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-goby", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Represents the default settings that will be used by the sync method if
    * an update dialog is configured to be displayed.
    */
  var DEFAULT_UPDATE_DIALOG: UpdateDialog = js.native
  /**
    * Decorates a React Component configuring it to sync for updates with the Goby server.
    *
    * @param options Options used to configure the end-user sync and update experience (e.g. when to check for updates?, show an prompt?, install the update immediately?).
    */
  def apply(): js.Function = js.native
  def apply(options: GobyOptions): js.Function = js.native
  /**
    * Allow Goby to restart the app.
    */
  def allowRestart(): Unit = js.native
  /**
    * Asks the Goby service whether the configured app deployment has an update available.
    *
    * @param deploymentKey The deployment key to use to query the Goby server for an update.
    */
  def checkForUpdate(): js.Promise[RemotePackage] = js.native
  def checkForUpdate(deploymentKey: String): js.Promise[RemotePackage] = js.native
  /**
    * Forbid Goby to restart the app.
    */
  def disallowRestart(): Unit = js.native
  /**
    * Retrieves the metadata for an installed update (e.g. description, mandatory).
    *
    * @param updateState The state of the update you want to retrieve the metadata for. Defaults to UpdateState.RUNNING.
    */
  def getUpdateMetadata(): js.Promise[LocalPackage] = js.native
  def getUpdateMetadata(updateState: UpdateState): js.Promise[LocalPackage] = js.native
  /**
    * Notifies the Goby runtime that an installed update is considered successful.
    */
  def notifyAppReady(): js.Promise[StatusReport] = js.native
  /**
    * Immediately restarts the app.
    *
    * @param onlyIfUpdateIsPending Indicates whether you want the restart to no-op if there isn't currently a pending update.
    */
  def restartApp(): Unit = js.native
  def restartApp(onlyIfUpdateIsPending: Boolean): Unit = js.native
  /**
    * Allows checking for an update, downloading it and installing it, all with a single call.
    *
    * @param options Options used to configure the end-user update experience (e.g. show an prompt?, install the update immediately?).
    * @param syncStatusChangedCallback An optional callback that allows tracking the status of the sync operation, as opposed to simply checking the resolved state via the returned Promise.
    * @param downloadProgressCallback An optional callback that allows tracking the progress of an update while it is being downloaded.
    */
  def sync(): js.Promise[SyncStatus] = js.native
  def sync(options: SyncOptions): js.Promise[SyncStatus] = js.native
  def sync(options: SyncOptions, syncStatusChangedCallback: SyncStatusChangedCallback): js.Promise[SyncStatus] = js.native
  def sync(
    options: SyncOptions,
    syncStatusChangedCallback: SyncStatusChangedCallback,
    downloadProgressCallback: DownloadProgressCallback
  ): js.Promise[SyncStatus] = js.native
  /**
    * Indicates when you would like to check for (and install) updates from the Goby server.
    */
  @js.native
  object CheckFrequency extends js.Object {
    /* 2 */ val MANUAL: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.CheckFrequency.MANUAL with Double = js.native
    /* 1 */ val ON_APP_RESUME: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.CheckFrequency.ON_APP_RESUME with Double = js.native
    /* 0 */ val ON_APP_START: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.CheckFrequency.ON_APP_START with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.CheckFrequency with Double
      ] = js.native
  }
  
  /**
    * Indicates the status of a deployment (after installing and restarting).
    */
  @js.native
  object DeploymentStatus extends js.Object {
    /* 0 */ val FAILED: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.DeploymentStatus.FAILED with Double = js.native
    /* 1 */ val SUCCEEDED: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.DeploymentStatus.SUCCEEDED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.DeploymentStatus with Double
      ] = js.native
  }
  
  /**
    * Indicates when you would like an installed update to actually be applied.
    */
  @js.native
  object InstallMode extends js.Object {
    /* 0 */ val IMMEDIATE: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.InstallMode.IMMEDIATE with Double = js.native
    /* 1 */ val ON_NEXT_RESTART: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.InstallMode.ON_NEXT_RESTART with Double = js.native
    /* 2 */ val ON_NEXT_RESUME: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.InstallMode.ON_NEXT_RESUME with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.InstallMode with Double
      ] = js.native
  }
  
  /**
    * Indicates the current status of a sync operation.
    */
  @js.native
  object SyncStatus extends js.Object {
    /* 1 */ val AWAITING_USER_ACTION: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.AWAITING_USER_ACTION with Double = js.native
    /* 0 */ val CHECKING_FOR_UPDATE: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.CHECKING_FOR_UPDATE with Double = js.native
    /* 2 */ val DOWNLOADING_PACKAGE: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.DOWNLOADING_PACKAGE with Double = js.native
    /* 3 */ val INSTALLING_UPDATE: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.INSTALLING_UPDATE with Double = js.native
    /* 7 */ val SYNC_IN_PROGRESS: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.SYNC_IN_PROGRESS with Double = js.native
    /* 8 */ val UNKNOWN_ERROR: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.UNKNOWN_ERROR with Double = js.native
    /* 5 */ val UPDATE_IGNORED: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.UPDATE_IGNORED with Double = js.native
    /* 6 */ val UPDATE_INSTALLED: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.UPDATE_INSTALLED with Double = js.native
    /* 4 */ val UP_TO_DATE: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus.UP_TO_DATE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus with Double
      ] = js.native
  }
  
  /**
    * Indicates the state that an update is currently in.
    */
  @js.native
  object UpdateState extends js.Object {
    /* 2 */ val LATEST: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.UpdateState.LATEST with Double = js.native
    /* 1 */ val PENDING: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.UpdateState.PENDING with Double = js.native
    /* 0 */ val RUNNING: typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.UpdateState.RUNNING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.UpdateState with Double
      ] = js.native
  }
  
}

