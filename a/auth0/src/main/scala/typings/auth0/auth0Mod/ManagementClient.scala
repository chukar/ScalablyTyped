package typings.auth0.auth0Mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "ManagementClient")
@js.native
class ManagementClient[A, U] protected () extends js.Object {
  def this(options: ManagementClientOptions) = this()
  def addPermissionsInRole(params: ObjectWithId, data: PermissionsData): js.Promise[Unit] = js.native
  def addPermissionsInRole(params: ObjectWithId, data: PermissionsData, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def assignPermissionsToUser(params: ObjectWithId, data: PermissionsData): js.Promise[Unit] = js.native
  def assignPermissionsToUser(params: ObjectWithId, data: PermissionsData, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  // The lowercase 't' is like this in the auth0 sdk
  def assignRolestoUser(params: ObjectWithId, data: RolesData): js.Promise[Unit] = js.native
  def assignRolestoUser(params: ObjectWithId, data: RolesData, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def blacklistToken(token: Token): js.Promise[_] = js.native
  def blacklistToken(token: Token, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def configureEmailProvider(data: Data): js.Promise[_] = js.native
  def configureEmailProvider(data: Data, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def createClient(data: Data): js.Promise[Client] = js.native
  def createClient(data: Data, cb: js.Function2[/* err */ Error, /* client */ Client, Unit]): Unit = js.native
  def createClientGrant(data: CreateClientGrant): js.Promise[ClientGrant] = js.native
  def createClientGrant(data: CreateClientGrant, cb: js.Function2[/* err */ Error, /* data */ ClientGrant, Unit]): Unit = js.native
  def createConnection(data: CreateConnection): js.Promise[Connection] = js.native
  def createConnection(data: CreateConnection, cb: js.Function2[/* err */ Error, /* connection */ Connection, Unit]): Unit = js.native
  def createDevicePublicKey(data: Data): js.Promise[User[A, U]] = js.native
  def createDevicePublicKey(data: Data, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  // Templates
  def createEmailTemplate(data: Data): js.Promise[_] = js.native
  def createEmailTemplate(data: Data, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSName("createEmailTemplate")
  def createEmailTemplate_Unit(data: Data): Unit = js.native
  def createEmailVerificationTicket(data: EmailVerificationTicketOptions): js.Promise[_] = js.native
  def createEmailVerificationTicket(data: EmailVerificationTicketOptions, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("createEmailVerificationTicket")
  def createEmailVerificationTicket_Unit(data: EmailVerificationTicketOptions): Unit = js.native
  // Tickets
  def createPasswordChangeTicket(params: PasswordChangeTicketParams): js.Promise[PasswordChangeTicketResponse] = js.native
  def createPasswordChangeTicket(
    params: PasswordChangeTicketParams,
    cb: js.Function2[/* err */ Error, /* data */ PasswordChangeTicketResponse, Unit]
  ): Unit = js.native
  @JSName("createPasswordChangeTicket")
  def createPasswordChangeTicket_Unit(params: PasswordChangeTicketParams): Unit = js.native
  // Resource Server
  def createResourceServer(data: CreateResourceServer): js.Promise[ResourceServer] = js.native
  def createResourceServer(data: CreateResourceServer, cb: js.Function2[/* err */ Error, /* data */ ResourceServer, Unit]): Unit = js.native
  @JSName("createResourceServer")
  def createResourceServer_Unit(data: CreateResourceServer): Unit = js.native
  def createRole(data: CreateRoleData): js.Promise[Role] = js.native
  def createRole(data: CreateRoleData, cb: js.Function2[/* err */ Error, /* role */ Role, Unit]): Unit = js.native
  def createRule(data: Data): js.Promise[Rule] = js.native
  def createRule(data: Data, cb: js.Function2[/* err */ Error, /* rule */ Rule, Unit]): Unit = js.native
  def createUser(data: CreateUserData): js.Promise[User[A, U]] = js.native
  def createUser(data: CreateUserData, cb: js.Function2[/* err */ Error, /* user */ User[A, U], Unit]): Unit = js.native
  // Should be removed from auth0 also. Doesn't exist in api.
  def deleteAllUsers(): js.Promise[User[A, U]] = js.native
  def deleteAllUsers(cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def deleteClient(params: ClientParams): js.Promise[Unit] = js.native
  def deleteClient(params: ClientParams, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def deleteClientGrant(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteClientGrant(params: ObjectWithId, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def deleteConnection(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteConnection(params: ObjectWithId, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def deleteDeviceCredential(params: ClientParams): js.Promise[User[A, U]] = js.native
  def deleteDeviceCredential(params: ClientParams, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def deleteEmailProvider(): js.Promise[_] = js.native
  def deleteEmailProvider(cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("deleteEmailProvider")
  def deleteEmailProvider_Unit(): Unit = js.native
  def deleteResourceServer(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteResourceServer(params: ObjectWithId, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSName("deleteResourceServer")
  def deleteResourceServer_Unit(params: ObjectWithId): Unit = js.native
  def deleteRole(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteRole(params: ObjectWithId, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def deleteRule(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteRule(params: ObjectWithId, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def deleteUser(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteUser(params: ObjectWithId, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams): js.Promise[Unit] = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSName("deleteUser")
  def deleteUser_Unit(params: ObjectWithId): Unit = js.native
  def exportUsers(data: ExportUsersOptions): js.Promise[ExportUsersJob] = js.native
  def exportUsers(data: ExportUsersOptions, cb: js.Function2[/* err */ Error, /* data */ ExportUsersJob, Unit]): Unit = js.native
  @JSName("exportUsers")
  def exportUsers_Unit(data: ExportUsersOptions): Unit = js.native
  // Statistics
  def getActiveUsersCount(): js.Promise[_] = js.native
  def getActiveUsersCount(cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("getActiveUsersCount")
  def getActiveUsersCount_Unit(): Unit = js.native
  // Tokens
  def getBlacklistedTokens(): js.Promise[_] = js.native
  def getBlacklistedTokens(cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("getBlacklistedTokens")
  def getBlacklistedTokens_Unit(): Unit = js.native
  def getClient(params: ClientParams): js.Promise[Client] = js.native
  def getClient(params: ClientParams, cb: js.Function2[/* err */ Error, /* client */ Client, Unit]): Unit = js.native
  // Client Grants
  def getClientGrants(): js.Promise[js.Array[ClientGrant]] = js.native
  def getClientGrants(cb: js.Function2[/* err */ Error, /* data */ js.Array[ClientGrant], Unit]): Unit = js.native
  def getClientInfo(): ClientInfo = js.native
  // Clients
  def getClients(): js.Promise[js.Array[Client]] = js.native
  def getClients(cb: js.Function2[/* err */ Error, /* clients */ js.Array[Client], Unit]): Unit = js.native
  def getClients(params: GetClientsOptions): js.Promise[js.Array[Client]] = js.native
  def getClients(params: GetClientsOptions, cb: js.Function2[/* err */ Error, /* clients */ js.Array[Client], Unit]): Unit = js.native
  def getConnection(params: ObjectWithId): js.Promise[Connection] = js.native
  def getConnection(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* connection */ Connection, Unit]): Unit = js.native
  // Connections
  def getConnections(): js.Promise[js.Array[Connection]] = js.native
  def getConnections(cb: js.Function2[/* err */ Error, /* connections */ js.Array[Connection], Unit]): Unit = js.native
  def getDailyStats(data: StatsParams): js.Promise[_] = js.native
  def getDailyStats(data: StatsParams, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  // Device Keys
  def getDeviceCredentials(): js.Promise[User[A, U]] = js.native
  def getDeviceCredentials(cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  // Providers
  def getEmailProvider(): js.Promise[_] = js.native
  def getEmailProvider(cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("getEmailProvider")
  def getEmailProvider_Unit(): Unit = js.native
  def getEmailTemplate(data: Data): js.Promise[_] = js.native
  def getEmailTemplate(data: Data, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("getEmailTemplate")
  def getEmailTemplate_Unit(data: Data): Unit = js.native
  // Jobs
  def getJob(params: ObjectWithId): js.Promise[Job] = js.native
  def getJob(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* data */ Job, Unit]): Unit = js.native
  @JSName("getJob")
  def getJob_Unit(params: ObjectWithId): Unit = js.native
  // Logs
  def getLog(params: ObjectWithId): js.Promise[_] = js.native
  def getLog(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("getLog")
  def getLog_Unit(params: ObjectWithId): Unit = js.native
  def getLogs(): js.Promise[_] = js.native
  def getLogs(cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("getLogs")
  def getLogs_Unit(): Unit = js.native
  def getPermissionsInRole(params: ObjectWithId): js.Promise[js.Array[Permission]] = js.native
  def getPermissionsInRole(
    params: ObjectWithId,
    cb: js.Function2[/* err */ Error, /* permissions */ js.Array[Permission], Unit]
  ): Unit = js.native
  def getResourceServer(data: ObjectWithId): js.Promise[ResourceServer] = js.native
  def getResourceServer(data: ObjectWithId, cb: js.Function2[/* err */ Error, /* data */ ResourceServer, Unit]): Unit = js.native
  @JSName("getResourceServer")
  def getResourceServer_Unit(data: ObjectWithId): Unit = js.native
  def getResourceServers(): js.Promise[js.Array[ResourceServer]] = js.native
  def getResourceServers(cb: js.Function2[/* err */ Error, /* data */ js.Array[ResourceServer], Unit]): Unit = js.native
  @JSName("getResourceServers")
  def getResourceServers_Unit(): Unit = js.native
  def getRole(params: ObjectWithId): js.Promise[Role] = js.native
  def getRole(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* role */ Role, Unit]): Unit = js.native
  // Roles
  def getRoles(): js.Promise[js.Array[Role]] = js.native
  def getRoles(cb: js.Function2[/* err */ Error, /* roles */ js.Array[Role], Unit]): Unit = js.native
  def getRoles(params: GetRolesData): js.Promise[js.Array[Role]] = js.native
  def getRoles(params: GetRolesDataPaged): js.Promise[RolePage] = js.native
  def getRoles(params: GetRolesDataPaged, cb: js.Function2[/* err */ Error, /* rolePage */ RolePage, Unit]): Unit = js.native
  def getRoles(params: GetRolesData, cb: js.Function2[/* err */ Error, /* roles */ js.Array[Role], Unit]): Unit = js.native
  def getRule(params: ClientParams): js.Promise[Rule] = js.native
  def getRule(params: ClientParams, cb: js.Function2[/* err */ Error, /* rule */ Rule, Unit]): Unit = js.native
  // Rules
  def getRules(): js.Promise[js.Array[Rule]] = js.native
  def getRules(cb: js.Function2[/* err */ Error, /* rules */ js.Array[Rule], Unit]): Unit = js.native
  // Tenant
  def getTenantSettings(): js.Promise[_] = js.native
  def getTenantSettings(cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("getTenantSettings")
  def getTenantSettings_Unit(): Unit = js.native
  def getUser(params: ObjectWithId): js.Promise[User[A, U]] = js.native
  def getUser(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* user */ User[A, U], Unit]): Unit = js.native
  // User Blocks
  def getUserBlocks(params: ObjectWithId): js.Promise[UserBlocks] = js.native
  def getUserBlocks(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* response */ UserBlocks, Unit]): Unit = js.native
  def getUserBlocksByIdentifier(params: ObjectWithIdentifier): js.Promise[UserBlocks] = js.native
  def getUserBlocksByIdentifier(params: ObjectWithIdentifier, cb: js.Function2[/* err */ Error, /* response */ UserBlocks, Unit]): Unit = js.native
  def getUserPermissions(params: GetUserPermissionsData): js.Promise[js.Array[Permission]] = js.native
  def getUserPermissions(params: GetUserPermissionsDataPaged): js.Promise[PermissionPage] = js.native
  def getUserPermissions(
    params: GetUserPermissionsDataPaged,
    cb: js.Function2[/* err */ Error, /* permissionPage */ PermissionPage, Unit]
  ): Unit = js.native
  def getUserPermissions(
    params: GetUserPermissionsData,
    cb: js.Function2[/* err */ Error, /* permissions */ js.Array[Permission], Unit]
  ): Unit = js.native
  // User permissions
  def getUserPermissions(params: ObjectWithId): js.Promise[js.Array[Permission]] = js.native
  def getUserPermissions(
    params: ObjectWithId,
    cb: js.Function2[/* err */ Error, /* permissions */ js.Array[Permission], Unit]
  ): Unit = js.native
  def getUserRoles(params: GetUserRolesData): js.Promise[js.Array[Role]] = js.native
  def getUserRoles(params: GetUserRolesDataPaged): js.Promise[RolePage] = js.native
  def getUserRoles(params: GetUserRolesDataPaged, cb: js.Function2[/* err */ Error, /* rolePage */ RolePage, Unit]): Unit = js.native
  def getUserRoles(params: GetUserRolesData, cb: js.Function2[/* err */ Error, /* roles */ js.Array[Role], Unit]): Unit = js.native
  // User roles
  def getUserRoles(params: ObjectWithId): js.Promise[js.Array[Role]] = js.native
  def getUserRoles(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* roles */ js.Array[Role], Unit]): Unit = js.native
  @JSName("getUser")
  def getUser_Unit(params: ObjectWithId): Unit = js.native
  def getUsers(): js.Promise[js.Array[User[A, U]]] = js.native
  def getUsers(cb: js.Function2[/* err */ Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  def getUsers(params: GetUsersData): js.Promise[js.Array[User[A, U]]] = js.native
  // Users
  def getUsers(params: GetUsersDataPaged): js.Promise[UserPage[A, U]] = js.native
  def getUsers(params: GetUsersDataPaged, cb: js.Function2[/* err */ Error, /* userPage */ UserPage[A, U], Unit]): Unit = js.native
  def getUsers(params: GetUsersData, cb: js.Function2[/* err */ Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  def getUsersByEmail(email: String): js.Promise[js.Array[User[A, U]]] = js.native
  def getUsersByEmail(email: String, cb: js.Function2[/* err */ Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  @JSName("getUsersByEmail")
  def getUsersByEmail_Unit(email: String): Unit = js.native
  def getUsersInRole(params: GetRoleUsersData): js.Promise[js.Array[User[A, U]]] = js.native
  def getUsersInRole(params: GetRoleUsersDataPaged): js.Promise[UserPage[A, U]] = js.native
  def getUsersInRole(
    params: GetRoleUsersDataPaged,
    cb: js.Function2[/* err */ Error, /* userPage */ UserPage[A, U], Unit]
  ): Unit = js.native
  def getUsersInRole(
    params: GetRoleUsersData,
    cb: js.Function2[/* err */ Error, /* users */ js.Array[User[A, U]], Unit]
  ): Unit = js.native
  def getUsersInRole(params: ObjectWithId): js.Promise[js.Array[User[A, U]]] = js.native
  def getUsersInRole(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  @JSName("getUsers")
  def getUsers_Unit(): Unit = js.native
  @JSName("getUsers")
  def getUsers_Unit(params: GetUsersData): Unit = js.native
  def importUsers(data: ImportUsersOptions): js.Promise[ImportUsersJob] = js.native
  def importUsers(data: ImportUsersOptions, cb: js.Function2[/* err */ Error, /* data */ ImportUsersJob, Unit]): Unit = js.native
  @JSName("importUsers")
  def importUsers_Unit(data: ImportUsersOptions): Unit = js.native
  def linkUsers(userId: String, params: LinkAccountsParams): js.Promise[_] = js.native
  def linkUsers(
    userId: String,
    params: LinkAccountsParams,
    cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  def removePermissionsFromRole(params: ObjectWithId, data: PermissionsData): js.Promise[Unit] = js.native
  def removePermissionsFromRole(params: ObjectWithId, data: PermissionsData, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def removePermissionsFromUser(params: ObjectWithId, data: PermissionsData): js.Promise[Unit] = js.native
  def removePermissionsFromUser(params: ObjectWithId, data: PermissionsData, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def removeRolesFromUser(params: ObjectWithId, data: RolesData): js.Promise[Unit] = js.native
  def removeRolesFromUser(params: ObjectWithId, data: RolesData, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendEmailVerification(data: UserIdParams): js.Promise[VerificationEmailJob] = js.native
  def sendEmailVerification(data: UserIdParams, cb: js.Function2[/* err */ Error, /* data */ VerificationEmailJob, Unit]): Unit = js.native
  @JSName("sendEmailVerification")
  def sendEmailVerification_Unit(data: UserIdParams): Unit = js.native
  def unblockUser(params: ObjectWithId): js.Promise[String] = js.native
  def unblockUser(params: ObjectWithId, cb: js.Function2[/* err */ Error, /* response */ String, Unit]): Unit = js.native
  def unblockUserByIdentifier(params: ObjectWithIdentifier): js.Promise[String] = js.native
  def unblockUserByIdentifier(params: ObjectWithIdentifier, cb: js.Function2[/* err */ Error, /* response */ String, Unit]): Unit = js.native
  def unlinkUsers(params: UnlinkAccountsParams): js.Promise[UnlinkAccountsResponse] = js.native
  def unlinkUsers(
    params: UnlinkAccountsParams,
    cb: js.Function2[/* err */ Error, /* data */ UnlinkAccountsResponse, Unit]
  ): Unit = js.native
  def updateAppMetadata(params: ObjectWithId, data: A): js.Promise[User[A, U]] = js.native
  def updateAppMetadata(params: ObjectWithId, data: A, cb: js.Function2[/* err */ Error, /* data */ User[A, U], Unit]): Unit = js.native
  def updateClient(params: ClientParams, data: Data): js.Promise[Client] = js.native
  def updateClient(params: ClientParams, data: Data, cb: js.Function2[/* err */ Error, /* client */ Client, Unit]): Unit = js.native
  def updateClientGrant(params: ObjectWithId, data: UpdateClientGrant): js.Promise[ClientGrant] = js.native
  def updateClientGrant(
    params: ObjectWithId,
    data: UpdateClientGrant,
    cb: js.Function2[/* err */ Error, /* data */ ClientGrant, Unit]
  ): Unit = js.native
  def updateConnection(params: ObjectWithId, data: UpdateConnection): js.Promise[Connection] = js.native
  def updateConnection(
    params: ObjectWithId,
    data: UpdateConnection,
    cb: js.Function2[/* err */ Error, /* connection */ Connection, Unit]
  ): Unit = js.native
  def updateEmailProvider(params: js.Object, data: Data): js.Promise[_] = js.native
  def updateEmailProvider(params: js.Object, data: Data, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("updateEmailProvider")
  def updateEmailProvider_Unit(params: js.Object, data: Data): Unit = js.native
  def updateEmailTemplate(params: js.Object, data: Data): js.Promise[_] = js.native
  def updateEmailTemplate(params: js.Object, data: Data, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("updateEmailTemplate")
  def updateEmailTemplate_Unit(params: js.Object, data: Data): Unit = js.native
  def updateResourceServer(params: ObjectWithId, data: ResourceServer): js.Promise[ResourceServer] = js.native
  def updateResourceServer(
    params: ObjectWithId,
    data: ResourceServer,
    cb: js.Function2[/* err */ Error, /* data */ ResourceServer, Unit]
  ): Unit = js.native
  @JSName("updateResourceServer")
  def updateResourceServer_Unit(params: ObjectWithId, data: ResourceServer): Unit = js.native
  def updateRole(params: ObjectWithId, data: UpdateRoleData): js.Promise[Role] = js.native
  def updateRole(
    params: ObjectWithId,
    data: UpdateRoleData,
    cb: js.Function2[/* err */ Error, /* role */ Role, Unit]
  ): Unit = js.native
  def updateRule(params: ObjectWithId, data: Data): js.Promise[Rule] = js.native
  def updateRule(params: ObjectWithId, data: Data, cb: js.Function2[/* err */ Error, /* rule */ Rule, Unit]): Unit = js.native
  def updateTenantSettings(data: Data): js.Promise[_] = js.native
  def updateTenantSettings(data: Data, cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("updateTenantSettings")
  def updateTenantSettings_Unit(data: Data): Unit = js.native
  def updateUser(params: ObjectWithId, data: UpdateUserData): js.Promise[User[A, U]] = js.native
  def updateUser(
    params: ObjectWithId,
    data: UpdateUserData,
    cb: js.Function2[/* err */ Error, /* data */ User[A, U], Unit]
  ): Unit = js.native
  def updateUserMetadata(params: ObjectWithId, data: U): js.Promise[User[A, U]] = js.native
  def updateUserMetadata(params: ObjectWithId, data: U, cb: js.Function2[/* err */ Error, /* data */ User[A, U], Unit]): Unit = js.native
}

