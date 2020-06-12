# Schema Types

<details>
  <summary><strong>Table of Contents</strong></summary>

  * [Query](#query)
  * [Mutation](#mutation)
  * [Objects](#objects)
    * [Action](#action)
    * [ActionConnection](#actionconnection)
    * [Address](#address)
    * [AddressConnection](#addressconnection)
    * [Alert](#alert)
    * [AlertConnection](#alertconnection)
    * [AlertRule](#alertrule)
    * [AlertRuleConnection](#alertruleconnection)
    * [AssayGene](#assaygene)
    * [AssayGeneConnection](#assaygeneconnection)
    * [Assayclass](#assayclass)
    * [AssayclassConnection](#assayclassconnection)
    * [Attributes](#attributes)
    * [AttributesConnection](#attributesconnection)
    * [AuditLogs](#auditlogs)
    * [AuditLogsConnection](#auditlogsconnection)
    * [AuthenticationType](#authenticationtype)
    * [AuthenticationTypeConnection](#authenticationtypeconnection)
    * [BreedingZone](#breedingzone)
    * [BreedingZoneConnection](#breedingzoneconnection)
    * [Collaborator](#collaborator)
    * [CollaboratorConnection](#collaboratorconnection)
    * [Component](#component)
    * [ComponentConnection](#componentconnection)
    * [Country](#country)
    * [CountryConnection](#countryconnection)
    * [Crop](#crop)
    * [CropConnection](#cropconnection)
    * [Customer](#customer)
    * [CustomerConnection](#customerconnection)
    * [DataFormat](#dataformat)
    * [DataFormatConnection](#dataformatconnection)
    * [Delegation](#delegation)
    * [DelegationConnection](#delegationconnection)
    * [Donor](#donor)
    * [DonorConnection](#donorconnection)
    * [HtmlTag](#htmltag)
    * [HtmlTagConnection](#htmltagconnection)
    * [Instance](#instance)
    * [InstanceConnection](#instanceconnection)
    * [Language](#language)
    * [LanguageConnection](#languageconnection)
    * [Marker](#marker)
    * [MarkerConnection](#markerconnection)
    * [MarkerSynonym](#markersynonym)
    * [MarkerSynonymConnection](#markersynonymconnection)
    * [Message](#message)
    * [MessageConnection](#messageconnection)
    * [Module](#module)
    * [ModuleConnection](#moduleconnection)
    * [Organization](#organization)
    * [OrganizationConnection](#organizationconnection)
    * [Partner](#partner)
    * [PartnerConnection](#partnerconnection)
    * [Permission](#permission)
    * [PermissionConnection](#permissionconnection)
    * [Person](#person)
    * [PersonConnection](#personconnection)
    * [Phase](#phase)
    * [PhaseConnection](#phaseconnection)
    * [Pipeline](#pipeline)
    * [PipelineConnection](#pipelineconnection)
    * [Preference](#preference)
    * [PreferenceConnection](#preferenceconnection)
    * [Process](#process)
    * [ProcessConnection](#processconnection)
    * [Program](#program)
    * [ProgramConnection](#programconnection)
    * [Project](#project)
    * [ProjectConnection](#projectconnection)
    * [Purpose](#purpose)
    * [PurposeConnection](#purposeconnection)
    * [Role](#role)
    * [RoleAction](#roleaction)
    * [RoleActionConnection](#roleactionconnection)
    * [RoleConnection](#roleconnection)
    * [Schema](#schema)
    * [SchemaConnection](#schemaconnection)
    * [Scheme](#scheme)
    * [SchemeConnection](#schemeconnection)
    * [Season](#season)
    * [SeasonConnection](#seasonconnection)
    * [Service](#service)
    * [ServiceConnection](#serviceconnection)
    * [ServiceProvider](#serviceprovider)
    * [ServiceProviderConnection](#serviceproviderconnection)
    * [ServiceType](#servicetype)
    * [ServiceTypeConnection](#servicetypeconnection)
    * [Session](#session)
    * [SessionConnection](#sessionconnection)
    * [Stage](#stage)
    * [StageConnection](#stageconnection)
    * [StyleTheme](#styletheme)
    * [StyleThemeConnection](#stylethemeconnection)
    * [TechnologyPlatform](#technologyplatform)
    * [TechnologyPlatformConnection](#technologyplatformconnection)
    * [Tenant](#tenant)
    * [TenantConnection](#tenantconnection)
    * [Trait](#trait)
    * [TraitClass](#traitclass)
    * [TraitClassConnection](#traitclassconnection)
    * [TraitConnection](#traitconnection)
    * [Translation](#translation)
    * [TranslationConnection](#translationconnection)
    * [User](#user)
    * [UserConnection](#userconnection)
    * [Vendor](#vendor)
    * [VendorConnection](#vendorconnection)
    * [Workflow](#workflow)
    * [WorkflowConnection](#workflowconnection)
    * [WorkflowNode](#workflownode)
    * [WorkflowNodeConnection](#workflownodeconnection)
  * [Inputs](#inputs)
    * [ActionInput](#actioninput)
    * [AddressInput](#addressinput)
    * [AlertInput](#alertinput)
    * [AlertRuleInput](#alertruleinput)
    * [AssayGeneInput](#assaygeneinput)
    * [AssayclassInput](#assayclassinput)
    * [AttributesInput](#attributesinput)
    * [AuditLogsInput](#auditlogsinput)
    * [AuthenticationTypeInput](#authenticationtypeinput)
    * [BreedingZoneInput](#breedingzoneinput)
    * [CollaboratorInput](#collaboratorinput)
    * [ComponentInput](#componentinput)
    * [CountryInput](#countryinput)
    * [CropInput](#cropinput)
    * [CustomerInput](#customerinput)
    * [DataFormatInput](#dataformatinput)
    * [DelegationInput](#delegationinput)
    * [DonorInput](#donorinput)
    * [FilterInput](#filterinput)
    * [HtmlTagInput](#htmltaginput)
    * [InstanceInput](#instanceinput)
    * [LanguageInput](#languageinput)
    * [MarkerInput](#markerinput)
    * [MarkerSynonymInput](#markersynonyminput)
    * [MessageInput](#messageinput)
    * [ModuleInput](#moduleinput)
    * [OrganizationInput](#organizationinput)
    * [PageInput](#pageinput)
    * [PartnerInput](#partnerinput)
    * [PermissionInput](#permissioninput)
    * [PersonInput](#personinput)
    * [PhaseInput](#phaseinput)
    * [PipelineInput](#pipelineinput)
    * [PreferenceInput](#preferenceinput)
    * [ProcessInput](#processinput)
    * [ProgramInput](#programinput)
    * [ProjectInput](#projectinput)
    * [PurposeInput](#purposeinput)
    * [RoleActionInput](#roleactioninput)
    * [RoleInput](#roleinput)
    * [SchemaInput](#schemainput)
    * [SchemeInput](#schemeinput)
    * [SeasonInput](#seasoninput)
    * [ServiceInput](#serviceinput)
    * [ServiceProviderInput](#serviceproviderinput)
    * [ServiceTypeInput](#servicetypeinput)
    * [SessionInput](#sessioninput)
    * [SortInput](#sortinput)
    * [StageInput](#stageinput)
    * [StyleThemeInput](#stylethemeinput)
    * [TechnologyPlatformInput](#technologyplatforminput)
    * [TenantInput](#tenantinput)
    * [TraitClassInput](#traitclassinput)
    * [TraitInput](#traitinput)
    * [TranslationInput](#translationinput)
    * [UserInput](#userinput)
    * [VendorInput](#vendorinput)
    * [WorkflowInput](#workflowinput)
    * [WorkflowNodeInput](#workflownodeinput)
  * [Enums](#enums)
    * [FilterMod](#filtermod)
    * [SortMod](#sortmod)
  * [Scalars](#scalars)
    * [Boolean](#boolean)
    * [Date](#date)
    * [ID](#id)
    * [Int](#int)
    * [String](#string)

</details>

## Query
<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>findWorkflowNode</strong></td>
<td valign="top"><a href="#workflownode">WorkflowNode</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findWorkflowNodeList</strong></td>
<td valign="top"><a href="#workflownodeconnection">WorkflowNodeConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAction</strong></td>
<td valign="top"><a href="#action">Action</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findActionList</strong></td>
<td valign="top"><a href="#actionconnection">ActionConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAddress</strong></td>
<td valign="top"><a href="#address">Address</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAddressList</strong></td>
<td valign="top"><a href="#addressconnection">AddressConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAlert</strong></td>
<td valign="top"><a href="#alert">Alert</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAlertList</strong></td>
<td valign="top"><a href="#alertconnection">AlertConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAlertRule</strong></td>
<td valign="top"><a href="#alertrule">AlertRule</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAlertRuleList</strong></td>
<td valign="top"><a href="#alertruleconnection">AlertRuleConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAttributes</strong></td>
<td valign="top"><a href="#attributes">Attributes</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAttributesList</strong></td>
<td valign="top"><a href="#attributesconnection">AttributesConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAuditLogs</strong></td>
<td valign="top"><a href="#auditlogs">AuditLogs</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAuditLogsList</strong></td>
<td valign="top"><a href="#auditlogsconnection">AuditLogsConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAuthenticationType</strong></td>
<td valign="top"><a href="#authenticationtype">AuthenticationType</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAuthenticationTypeList</strong></td>
<td valign="top"><a href="#authenticationtypeconnection">AuthenticationTypeConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findCollaborator</strong></td>
<td valign="top"><a href="#collaborator">Collaborator</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findCollaboratorList</strong></td>
<td valign="top"><a href="#collaboratorconnection">CollaboratorConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findComponent</strong></td>
<td valign="top"><a href="#component">Component</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findComponentList</strong></td>
<td valign="top"><a href="#componentconnection">ComponentConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findCountry</strong></td>
<td valign="top"><a href="#country">Country</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findCountryList</strong></td>
<td valign="top"><a href="#countryconnection">CountryConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findCrop</strong></td>
<td valign="top"><a href="#crop">Crop</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findCropList</strong></td>
<td valign="top"><a href="#cropconnection">CropConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findCustomer</strong></td>
<td valign="top"><a href="#customer">Customer</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findCustomerList</strong></td>
<td valign="top"><a href="#customerconnection">CustomerConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findDelegation</strong></td>
<td valign="top"><a href="#delegation">Delegation</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findDelegationList</strong></td>
<td valign="top"><a href="#delegationconnection">DelegationConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findDonor</strong></td>
<td valign="top"><a href="#donor">Donor</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findDonorList</strong></td>
<td valign="top"><a href="#donorconnection">DonorConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findHtmlTag</strong></td>
<td valign="top"><a href="#htmltag">HtmlTag</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findHtmlTagList</strong></td>
<td valign="top"><a href="#htmltagconnection">HtmlTagConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findInstance</strong></td>
<td valign="top"><a href="#instance">Instance</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findInstanceList</strong></td>
<td valign="top"><a href="#instanceconnection">InstanceConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findLanguage</strong></td>
<td valign="top"><a href="#language">Language</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findLanguageList</strong></td>
<td valign="top"><a href="#languageconnection">LanguageConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findMessage</strong></td>
<td valign="top"><a href="#message">Message</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findMessageList</strong></td>
<td valign="top"><a href="#messageconnection">MessageConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findModule</strong></td>
<td valign="top"><a href="#module">Module</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findModuleList</strong></td>
<td valign="top"><a href="#moduleconnection">ModuleConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findOrganization</strong></td>
<td valign="top"><a href="#organization">Organization</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findOrganizationList</strong></td>
<td valign="top"><a href="#organizationconnection">OrganizationConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPartner</strong></td>
<td valign="top"><a href="#partner">Partner</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPartnerList</strong></td>
<td valign="top"><a href="#partnerconnection">PartnerConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPermission</strong></td>
<td valign="top"><a href="#permission">Permission</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPermissionList</strong></td>
<td valign="top"><a href="#permissionconnection">PermissionConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPerson</strong></td>
<td valign="top"><a href="#person">Person</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPersonList</strong></td>
<td valign="top"><a href="#personconnection">PersonConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPreference</strong></td>
<td valign="top"><a href="#preference">Preference</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPreferenceList</strong></td>
<td valign="top"><a href="#preferenceconnection">PreferenceConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findProcess</strong></td>
<td valign="top"><a href="#process">Process</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findProcessList</strong></td>
<td valign="top"><a href="#processconnection">ProcessConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findProgram</strong></td>
<td valign="top"><a href="#program">Program</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findProgramList</strong></td>
<td valign="top"><a href="#programconnection">ProgramConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findProject</strong></td>
<td valign="top"><a href="#project">Project</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findProjectList</strong></td>
<td valign="top"><a href="#projectconnection">ProjectConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findRole</strong></td>
<td valign="top"><a href="#role">Role</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findRoleList</strong></td>
<td valign="top"><a href="#roleconnection">RoleConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findRoleAction</strong></td>
<td valign="top"><a href="#roleaction">RoleAction</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findRoleActionList</strong></td>
<td valign="top"><a href="#roleactionconnection">RoleActionConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findScheme</strong></td>
<td valign="top"><a href="#scheme">Scheme</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findSchemeList</strong></td>
<td valign="top"><a href="#schemeconnection">SchemeConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findSeason</strong></td>
<td valign="top"><a href="#season">Season</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findSeasonList</strong></td>
<td valign="top"><a href="#seasonconnection">SeasonConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findSession</strong></td>
<td valign="top"><a href="#session">Session</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findSessionList</strong></td>
<td valign="top"><a href="#sessionconnection">SessionConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTenant</strong></td>
<td valign="top"><a href="#tenant">Tenant</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTenantList</strong></td>
<td valign="top"><a href="#tenantconnection">TenantConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTranslation</strong></td>
<td valign="top"><a href="#translation">Translation</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTranslationList</strong></td>
<td valign="top"><a href="#translationconnection">TranslationConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findUser</strong></td>
<td valign="top"><a href="#user">User</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findUserList</strong></td>
<td valign="top"><a href="#userconnection">UserConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findVendor</strong></td>
<td valign="top"><a href="#vendor">Vendor</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findVendorList</strong></td>
<td valign="top"><a href="#vendorconnection">VendorConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findWorkflow</strong></td>
<td valign="top"><a href="#workflow">Workflow</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findWorkflowList</strong></td>
<td valign="top"><a href="#workflowconnection">WorkflowConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findStyleTheme</strong></td>
<td valign="top"><a href="#styletheme">StyleTheme</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findStyleThemeList</strong></td>
<td valign="top"><a href="#stylethemeconnection">StyleThemeConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findStage</strong></td>
<td valign="top"><a href="#stage">Stage</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findStageList</strong></td>
<td valign="top"><a href="#stageconnection">StageConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findBreedingZone</strong></td>
<td valign="top"><a href="#breedingzone">BreedingZone</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findBreedingZoneList</strong></td>
<td valign="top"><a href="#breedingzoneconnection">BreedingZoneConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPhase</strong></td>
<td valign="top"><a href="#phase">Phase</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPhaseList</strong></td>
<td valign="top"><a href="#phaseconnection">PhaseConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPipeline</strong></td>
<td valign="top"><a href="#pipeline">Pipeline</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPipelineList</strong></td>
<td valign="top"><a href="#pipelineconnection">PipelineConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findSchema</strong></td>
<td valign="top"><a href="#schema">Schema</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findSchemaList</strong></td>
<td valign="top"><a href="#schemaconnection">SchemaConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTraitClass</strong></td>
<td valign="top"><a href="#traitclass">TraitClass</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTraitClassList</strong></td>
<td valign="top"><a href="#traitclassconnection">TraitClassConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAssayclass</strong></td>
<td valign="top"><a href="#assayclass">Assayclass</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAssayclassList</strong></td>
<td valign="top"><a href="#assayclassconnection">AssayclassConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAssayGene</strong></td>
<td valign="top"><a href="#assaygene">AssayGene</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findAssayGeneList</strong></td>
<td valign="top"><a href="#assaygeneconnection">AssayGeneConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findDataFormat</strong></td>
<td valign="top"><a href="#dataformat">DataFormat</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findDataFormatList</strong></td>
<td valign="top"><a href="#dataformatconnection">DataFormatConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findMarker</strong></td>
<td valign="top"><a href="#marker">Marker</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findMarkerList</strong></td>
<td valign="top"><a href="#markerconnection">MarkerConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findMarkerSynonym</strong></td>
<td valign="top"><a href="#markersynonym">MarkerSynonym</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findMarkerSynonymList</strong></td>
<td valign="top"><a href="#markersynonymconnection">MarkerSynonymConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPurpose</strong></td>
<td valign="top"><a href="#purpose">Purpose</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findPurposeList</strong></td>
<td valign="top"><a href="#purposeconnection">PurposeConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findService</strong></td>
<td valign="top"><a href="#service">Service</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findServiceList</strong></td>
<td valign="top"><a href="#serviceconnection">ServiceConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findServiceProvider</strong></td>
<td valign="top"><a href="#serviceprovider">ServiceProvider</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findServiceProviderList</strong></td>
<td valign="top"><a href="#serviceproviderconnection">ServiceProviderConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findServiceType</strong></td>
<td valign="top"><a href="#servicetype">ServiceType</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findServiceTypeList</strong></td>
<td valign="top"><a href="#servicetypeconnection">ServiceTypeConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTechnologyPlatform</strong></td>
<td valign="top"><a href="#technologyplatform">TechnologyPlatform</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTechnologyPlatformList</strong></td>
<td valign="top"><a href="#technologyplatformconnection">TechnologyPlatformConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTrait</strong></td>
<td valign="top"><a href="#trait">Trait</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">id</td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>findTraitList</strong></td>
<td valign="top"><a href="#traitconnection">TraitConnection</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">page</td>
<td valign="top"><a href="#pageinput">PageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">sort</td>
<td valign="top"><a href="#sortinput">SortInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">filters</td>
<td valign="top">[<a href="#filterinput">FilterInput</a>]</td>
<td></td>
</tr>
</tbody>
</table>

## Mutation
<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>createWorkflowNode</strong></td>
<td valign="top"><a href="#workflownode">WorkflowNode</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">WorkflowNodeTo</td>
<td valign="top"><a href="#workflownodeinput">WorkflowNodeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyWorkflowNode</strong></td>
<td valign="top"><a href="#workflownode">WorkflowNode</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">WorkflowNodeTo</td>
<td valign="top"><a href="#workflownodeinput">WorkflowNodeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteWorkflowNode</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idworkflownode</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAction</strong></td>
<td valign="top"><a href="#action">Action</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ActionTo</td>
<td valign="top"><a href="#actioninput">ActionInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAction</strong></td>
<td valign="top"><a href="#action">Action</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ActionTo</td>
<td valign="top"><a href="#actioninput">ActionInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAction</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idaction</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAddress</strong></td>
<td valign="top"><a href="#address">Address</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AddressTo</td>
<td valign="top"><a href="#addressinput">AddressInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAddress</strong></td>
<td valign="top"><a href="#address">Address</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AddressTo</td>
<td valign="top"><a href="#addressinput">AddressInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAddress</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idaddress</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAlert</strong></td>
<td valign="top"><a href="#alert">Alert</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AlertTo</td>
<td valign="top"><a href="#alertinput">AlertInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAlert</strong></td>
<td valign="top"><a href="#alert">Alert</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AlertTo</td>
<td valign="top"><a href="#alertinput">AlertInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAlert</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idalert</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAlertRule</strong></td>
<td valign="top"><a href="#alertrule">AlertRule</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AlertRuleTo</td>
<td valign="top"><a href="#alertruleinput">AlertRuleInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAlertRule</strong></td>
<td valign="top"><a href="#alertrule">AlertRule</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AlertRuleTo</td>
<td valign="top"><a href="#alertruleinput">AlertRuleInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAlertRule</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idalertrule</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAttributes</strong></td>
<td valign="top"><a href="#attributes">Attributes</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AttributesTo</td>
<td valign="top"><a href="#attributesinput">AttributesInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAttributes</strong></td>
<td valign="top"><a href="#attributes">Attributes</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AttributesTo</td>
<td valign="top"><a href="#attributesinput">AttributesInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAttributes</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idattributes</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAuditLogs</strong></td>
<td valign="top"><a href="#auditlogs">AuditLogs</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AuditLogsTo</td>
<td valign="top"><a href="#auditlogsinput">AuditLogsInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAuditLogs</strong></td>
<td valign="top"><a href="#auditlogs">AuditLogs</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AuditLogsTo</td>
<td valign="top"><a href="#auditlogsinput">AuditLogsInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAuditLogs</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idauditlogs</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAuthenticationType</strong></td>
<td valign="top"><a href="#authenticationtype">AuthenticationType</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AuthenticationTypeTo</td>
<td valign="top"><a href="#authenticationtypeinput">AuthenticationTypeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAuthenticationType</strong></td>
<td valign="top"><a href="#authenticationtype">AuthenticationType</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AuthenticationTypeTo</td>
<td valign="top"><a href="#authenticationtypeinput">AuthenticationTypeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAuthenticationType</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idauthenticationtype</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createCollaborator</strong></td>
<td valign="top"><a href="#collaborator">Collaborator</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">CollaboratorTo</td>
<td valign="top"><a href="#collaboratorinput">CollaboratorInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyCollaborator</strong></td>
<td valign="top"><a href="#collaborator">Collaborator</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">CollaboratorTo</td>
<td valign="top"><a href="#collaboratorinput">CollaboratorInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteCollaborator</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idcollaborator</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createComponent</strong></td>
<td valign="top"><a href="#component">Component</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ComponentTo</td>
<td valign="top"><a href="#componentinput">ComponentInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyComponent</strong></td>
<td valign="top"><a href="#component">Component</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ComponentTo</td>
<td valign="top"><a href="#componentinput">ComponentInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteComponent</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idcomponent</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createCountry</strong></td>
<td valign="top"><a href="#country">Country</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">CountryTo</td>
<td valign="top"><a href="#countryinput">CountryInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyCountry</strong></td>
<td valign="top"><a href="#country">Country</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">CountryTo</td>
<td valign="top"><a href="#countryinput">CountryInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteCountry</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idcountry</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createCrop</strong></td>
<td valign="top"><a href="#crop">Crop</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">CropTo</td>
<td valign="top"><a href="#cropinput">CropInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyCrop</strong></td>
<td valign="top"><a href="#crop">Crop</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">CropTo</td>
<td valign="top"><a href="#cropinput">CropInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteCrop</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idcrop</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createCustomer</strong></td>
<td valign="top"><a href="#customer">Customer</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">CustomerTo</td>
<td valign="top"><a href="#customerinput">CustomerInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyCustomer</strong></td>
<td valign="top"><a href="#customer">Customer</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">CustomerTo</td>
<td valign="top"><a href="#customerinput">CustomerInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteCustomer</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idcustomer</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createDelegation</strong></td>
<td valign="top"><a href="#delegation">Delegation</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">DelegationTo</td>
<td valign="top"><a href="#delegationinput">DelegationInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyDelegation</strong></td>
<td valign="top"><a href="#delegation">Delegation</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">DelegationTo</td>
<td valign="top"><a href="#delegationinput">DelegationInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteDelegation</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">iddelegation</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createDonor</strong></td>
<td valign="top"><a href="#donor">Donor</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">DonorTo</td>
<td valign="top"><a href="#donorinput">DonorInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyDonor</strong></td>
<td valign="top"><a href="#donor">Donor</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">DonorTo</td>
<td valign="top"><a href="#donorinput">DonorInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteDonor</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">iddonor</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createHtmlTag</strong></td>
<td valign="top"><a href="#htmltag">HtmlTag</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">HtmlTagTo</td>
<td valign="top"><a href="#htmltaginput">HtmlTagInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyHtmlTag</strong></td>
<td valign="top"><a href="#htmltag">HtmlTag</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">HtmlTagTo</td>
<td valign="top"><a href="#htmltaginput">HtmlTagInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteHtmlTag</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idhtmltag</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createInstance</strong></td>
<td valign="top"><a href="#instance">Instance</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">InstanceTo</td>
<td valign="top"><a href="#instanceinput">InstanceInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyInstance</strong></td>
<td valign="top"><a href="#instance">Instance</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">InstanceTo</td>
<td valign="top"><a href="#instanceinput">InstanceInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteInstance</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idinstance</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createLanguage</strong></td>
<td valign="top"><a href="#language">Language</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">LanguageTo</td>
<td valign="top"><a href="#languageinput">LanguageInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyLanguage</strong></td>
<td valign="top"><a href="#language">Language</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">LanguageTo</td>
<td valign="top"><a href="#languageinput">LanguageInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteLanguage</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idlanguage</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createMessage</strong></td>
<td valign="top"><a href="#message">Message</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">MessageTo</td>
<td valign="top"><a href="#messageinput">MessageInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyMessage</strong></td>
<td valign="top"><a href="#message">Message</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">MessageTo</td>
<td valign="top"><a href="#messageinput">MessageInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteMessage</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idmessage</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createModule</strong></td>
<td valign="top"><a href="#module">Module</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ModuleTo</td>
<td valign="top"><a href="#moduleinput">ModuleInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyModule</strong></td>
<td valign="top"><a href="#module">Module</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ModuleTo</td>
<td valign="top"><a href="#moduleinput">ModuleInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteModule</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idmodule</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createOrganization</strong></td>
<td valign="top"><a href="#organization">Organization</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">OrganizationTo</td>
<td valign="top"><a href="#organizationinput">OrganizationInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyOrganization</strong></td>
<td valign="top"><a href="#organization">Organization</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">OrganizationTo</td>
<td valign="top"><a href="#organizationinput">OrganizationInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteOrganization</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idorganization</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createPartner</strong></td>
<td valign="top"><a href="#partner">Partner</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PartnerTo</td>
<td valign="top"><a href="#partnerinput">PartnerInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyPartner</strong></td>
<td valign="top"><a href="#partner">Partner</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PartnerTo</td>
<td valign="top"><a href="#partnerinput">PartnerInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deletePartner</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idpartner</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createPermission</strong></td>
<td valign="top"><a href="#permission">Permission</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PermissionTo</td>
<td valign="top"><a href="#permissioninput">PermissionInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyPermission</strong></td>
<td valign="top"><a href="#permission">Permission</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PermissionTo</td>
<td valign="top"><a href="#permissioninput">PermissionInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deletePermission</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idpermission</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createPerson</strong></td>
<td valign="top"><a href="#person">Person</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PersonTo</td>
<td valign="top"><a href="#personinput">PersonInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyPerson</strong></td>
<td valign="top"><a href="#person">Person</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PersonTo</td>
<td valign="top"><a href="#personinput">PersonInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deletePerson</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idperson</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createPreference</strong></td>
<td valign="top"><a href="#preference">Preference</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PreferenceTo</td>
<td valign="top"><a href="#preferenceinput">PreferenceInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyPreference</strong></td>
<td valign="top"><a href="#preference">Preference</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PreferenceTo</td>
<td valign="top"><a href="#preferenceinput">PreferenceInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deletePreference</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idpreference</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createProcess</strong></td>
<td valign="top"><a href="#process">Process</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ProcessTo</td>
<td valign="top"><a href="#processinput">ProcessInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyProcess</strong></td>
<td valign="top"><a href="#process">Process</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ProcessTo</td>
<td valign="top"><a href="#processinput">ProcessInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteProcess</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idprocess</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createProgram</strong></td>
<td valign="top"><a href="#program">Program</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ProgramTo</td>
<td valign="top"><a href="#programinput">ProgramInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyProgram</strong></td>
<td valign="top"><a href="#program">Program</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ProgramTo</td>
<td valign="top"><a href="#programinput">ProgramInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteProgram</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idprogram</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createProject</strong></td>
<td valign="top"><a href="#project">Project</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ProjectTo</td>
<td valign="top"><a href="#projectinput">ProjectInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyProject</strong></td>
<td valign="top"><a href="#project">Project</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ProjectTo</td>
<td valign="top"><a href="#projectinput">ProjectInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteProject</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idproject</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createRole</strong></td>
<td valign="top"><a href="#role">Role</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">RoleTo</td>
<td valign="top"><a href="#roleinput">RoleInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyRole</strong></td>
<td valign="top"><a href="#role">Role</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">RoleTo</td>
<td valign="top"><a href="#roleinput">RoleInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteRole</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idrole</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createRoleAction</strong></td>
<td valign="top"><a href="#roleaction">RoleAction</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">RoleActionTo</td>
<td valign="top"><a href="#roleactioninput">RoleActionInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyRoleAction</strong></td>
<td valign="top"><a href="#roleaction">RoleAction</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">RoleActionTo</td>
<td valign="top"><a href="#roleactioninput">RoleActionInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteRoleAction</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idroleaction</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createScheme</strong></td>
<td valign="top"><a href="#scheme">Scheme</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">SchemeTo</td>
<td valign="top"><a href="#schemeinput">SchemeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyScheme</strong></td>
<td valign="top"><a href="#scheme">Scheme</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">SchemeTo</td>
<td valign="top"><a href="#schemeinput">SchemeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteScheme</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idscheme</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createSeason</strong></td>
<td valign="top"><a href="#season">Season</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">SeasonTo</td>
<td valign="top"><a href="#seasoninput">SeasonInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifySeason</strong></td>
<td valign="top"><a href="#season">Season</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">SeasonTo</td>
<td valign="top"><a href="#seasoninput">SeasonInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteSeason</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idseason</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createSession</strong></td>
<td valign="top"><a href="#session">Session</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">SessionTo</td>
<td valign="top"><a href="#sessioninput">SessionInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifySession</strong></td>
<td valign="top"><a href="#session">Session</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">SessionTo</td>
<td valign="top"><a href="#sessioninput">SessionInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteSession</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idsession</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createTenant</strong></td>
<td valign="top"><a href="#tenant">Tenant</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TenantTo</td>
<td valign="top"><a href="#tenantinput">TenantInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyTenant</strong></td>
<td valign="top"><a href="#tenant">Tenant</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TenantTo</td>
<td valign="top"><a href="#tenantinput">TenantInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteTenant</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idtenant</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createTranslation</strong></td>
<td valign="top"><a href="#translation">Translation</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TranslationTo</td>
<td valign="top"><a href="#translationinput">TranslationInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyTranslation</strong></td>
<td valign="top"><a href="#translation">Translation</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TranslationTo</td>
<td valign="top"><a href="#translationinput">TranslationInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteTranslation</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idtranslation</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createUser</strong></td>
<td valign="top"><a href="#user">User</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">UserTo</td>
<td valign="top"><a href="#userinput">UserInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyUser</strong></td>
<td valign="top"><a href="#user">User</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">UserTo</td>
<td valign="top"><a href="#userinput">UserInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteUser</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">iduser</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createVendor</strong></td>
<td valign="top"><a href="#vendor">Vendor</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">VendorTo</td>
<td valign="top"><a href="#vendorinput">VendorInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyVendor</strong></td>
<td valign="top"><a href="#vendor">Vendor</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">VendorTo</td>
<td valign="top"><a href="#vendorinput">VendorInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteVendor</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idvendor</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createWorkflow</strong></td>
<td valign="top"><a href="#workflow">Workflow</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">WorkflowTo</td>
<td valign="top"><a href="#workflowinput">WorkflowInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyWorkflow</strong></td>
<td valign="top"><a href="#workflow">Workflow</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">WorkflowTo</td>
<td valign="top"><a href="#workflowinput">WorkflowInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteWorkflow</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idworkflow</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createStyleTheme</strong></td>
<td valign="top"><a href="#styletheme">StyleTheme</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">StyleThemeTo</td>
<td valign="top"><a href="#stylethemeinput">StyleThemeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyStyleTheme</strong></td>
<td valign="top"><a href="#styletheme">StyleTheme</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">StyleThemeTo</td>
<td valign="top"><a href="#stylethemeinput">StyleThemeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteStyleTheme</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idstyletheme</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createStage</strong></td>
<td valign="top"><a href="#stage">Stage</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">StageTo</td>
<td valign="top"><a href="#stageinput">StageInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyStage</strong></td>
<td valign="top"><a href="#stage">Stage</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">StageTo</td>
<td valign="top"><a href="#stageinput">StageInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteStage</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idstage</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createBreedingZone</strong></td>
<td valign="top"><a href="#breedingzone">BreedingZone</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">BreedingZoneTo</td>
<td valign="top"><a href="#breedingzoneinput">BreedingZoneInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyBreedingZone</strong></td>
<td valign="top"><a href="#breedingzone">BreedingZone</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">BreedingZoneTo</td>
<td valign="top"><a href="#breedingzoneinput">BreedingZoneInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteBreedingZone</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idbreedingzone</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createPhase</strong></td>
<td valign="top"><a href="#phase">Phase</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PhaseTo</td>
<td valign="top"><a href="#phaseinput">PhaseInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyPhase</strong></td>
<td valign="top"><a href="#phase">Phase</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PhaseTo</td>
<td valign="top"><a href="#phaseinput">PhaseInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deletePhase</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idphase</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createPipeline</strong></td>
<td valign="top"><a href="#pipeline">Pipeline</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PipelineTo</td>
<td valign="top"><a href="#pipelineinput">PipelineInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyPipeline</strong></td>
<td valign="top"><a href="#pipeline">Pipeline</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PipelineTo</td>
<td valign="top"><a href="#pipelineinput">PipelineInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deletePipeline</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idpipeline</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createSchema</strong></td>
<td valign="top"><a href="#schema">Schema</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">SchemaTo</td>
<td valign="top"><a href="#schemainput">SchemaInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifySchema</strong></td>
<td valign="top"><a href="#schema">Schema</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">SchemaTo</td>
<td valign="top"><a href="#schemainput">SchemaInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteSchema</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idschema</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createTraitClass</strong></td>
<td valign="top"><a href="#traitclass">TraitClass</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TraitClassTo</td>
<td valign="top"><a href="#traitclassinput">TraitClassInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyTraitClass</strong></td>
<td valign="top"><a href="#traitclass">TraitClass</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TraitClassTo</td>
<td valign="top"><a href="#traitclassinput">TraitClassInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteTraitClass</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idtraitclass</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAssayclass</strong></td>
<td valign="top"><a href="#assayclass">Assayclass</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AssayclassTo</td>
<td valign="top"><a href="#assayclassinput">AssayclassInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAssayclass</strong></td>
<td valign="top"><a href="#assayclass">Assayclass</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AssayclassTo</td>
<td valign="top"><a href="#assayclassinput">AssayclassInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAssayclass</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idassayclass</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createAssayGene</strong></td>
<td valign="top"><a href="#assaygene">AssayGene</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AssayGeneTo</td>
<td valign="top"><a href="#assaygeneinput">AssayGeneInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyAssayGene</strong></td>
<td valign="top"><a href="#assaygene">AssayGene</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">AssayGeneTo</td>
<td valign="top"><a href="#assaygeneinput">AssayGeneInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteAssayGene</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idassaygene</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createDataFormat</strong></td>
<td valign="top"><a href="#dataformat">DataFormat</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">DataFormatTo</td>
<td valign="top"><a href="#dataformatinput">DataFormatInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyDataFormat</strong></td>
<td valign="top"><a href="#dataformat">DataFormat</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">DataFormatTo</td>
<td valign="top"><a href="#dataformatinput">DataFormatInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteDataFormat</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">iddataformat</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createMarker</strong></td>
<td valign="top"><a href="#marker">Marker</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">MarkerTo</td>
<td valign="top"><a href="#markerinput">MarkerInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyMarker</strong></td>
<td valign="top"><a href="#marker">Marker</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">MarkerTo</td>
<td valign="top"><a href="#markerinput">MarkerInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteMarker</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idmarker</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createMarkerSynonym</strong></td>
<td valign="top"><a href="#markersynonym">MarkerSynonym</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">MarkerSynonymTo</td>
<td valign="top"><a href="#markersynonyminput">MarkerSynonymInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyMarkerSynonym</strong></td>
<td valign="top"><a href="#markersynonym">MarkerSynonym</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">MarkerSynonymTo</td>
<td valign="top"><a href="#markersynonyminput">MarkerSynonymInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteMarkerSynonym</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idmarkersynonym</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createPurpose</strong></td>
<td valign="top"><a href="#purpose">Purpose</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PurposeTo</td>
<td valign="top"><a href="#purposeinput">PurposeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyPurpose</strong></td>
<td valign="top"><a href="#purpose">Purpose</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">PurposeTo</td>
<td valign="top"><a href="#purposeinput">PurposeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deletePurpose</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idpurpose</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createService</strong></td>
<td valign="top"><a href="#service">Service</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ServiceTo</td>
<td valign="top"><a href="#serviceinput">ServiceInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyService</strong></td>
<td valign="top"><a href="#service">Service</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ServiceTo</td>
<td valign="top"><a href="#serviceinput">ServiceInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteService</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idservice</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createServiceProvider</strong></td>
<td valign="top"><a href="#serviceprovider">ServiceProvider</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ServiceProviderTo</td>
<td valign="top"><a href="#serviceproviderinput">ServiceProviderInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyServiceProvider</strong></td>
<td valign="top"><a href="#serviceprovider">ServiceProvider</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ServiceProviderTo</td>
<td valign="top"><a href="#serviceproviderinput">ServiceProviderInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteServiceProvider</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idserviceprovider</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createServiceType</strong></td>
<td valign="top"><a href="#servicetype">ServiceType</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ServiceTypeTo</td>
<td valign="top"><a href="#servicetypeinput">ServiceTypeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyServiceType</strong></td>
<td valign="top"><a href="#servicetype">ServiceType</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">ServiceTypeTo</td>
<td valign="top"><a href="#servicetypeinput">ServiceTypeInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteServiceType</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idservicetype</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createTechnologyPlatform</strong></td>
<td valign="top"><a href="#technologyplatform">TechnologyPlatform</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TechnologyPlatformTo</td>
<td valign="top"><a href="#technologyplatforminput">TechnologyPlatformInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyTechnologyPlatform</strong></td>
<td valign="top"><a href="#technologyplatform">TechnologyPlatform</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TechnologyPlatformTo</td>
<td valign="top"><a href="#technologyplatforminput">TechnologyPlatformInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteTechnologyPlatform</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idtechnologyplatform</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>createTrait</strong></td>
<td valign="top"><a href="#trait">Trait</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TraitTo</td>
<td valign="top"><a href="#traitinput">TraitInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modifyTrait</strong></td>
<td valign="top"><a href="#trait">Trait</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">TraitTo</td>
<td valign="top"><a href="#traitinput">TraitInput</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>deleteTrait</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" align="right" valign="top">idtrait</td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
</tbody>
</table>

## Objects

### Action

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>actionType</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>roleactions</strong></td>
<td valign="top">[<a href="#roleaction">RoleAction</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>module</strong></td>
<td valign="top"><a href="#module">Module</a></td>
<td></td>
</tr>
</tbody>
</table>

### ActionConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#action">Action</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Address

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>country</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>locality</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>region</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>postOfficeBoxNumber</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>postalCode</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>streetAddress</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>persons</strong></td>
<td valign="top">[<a href="#person">Person</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AddressConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#address">Address</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Alert

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alertrules</strong></td>
<td valign="top">[<a href="#alertrule">AlertRule</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>translations</strong></td>
<td valign="top">[<a href="#translation">Translation</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>preferences</strong></td>
<td valign="top">[<a href="#preference">Preference</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AlertConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#alert">Alert</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AlertRule

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sql</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>filterClause</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alert</strong></td>
<td valign="top"><a href="#alert">Alert</a></td>
<td></td>
</tr>
</tbody>
</table>

### AlertRuleConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#alertrule">AlertRule</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AssayGene

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>trait</strong></td>
<td valign="top"><a href="#trait">Trait</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>markers</strong></td>
<td valign="top">[<a href="#marker">Marker</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AssayGeneConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#assaygene">AssayGene</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Assayclass

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>technologyplatform</strong></td>
<td valign="top">[<a href="#technologyplatform">TechnologyPlatform</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>service</strong></td>
<td valign="top"><a href="#service">Service</a></td>
<td></td>
</tr>
</tbody>
</table>

### AssayclassConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#assayclass">Assayclass</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Attributes

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>help</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sortno</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>translations</strong></td>
<td valign="top">[<a href="#translation">Translation</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AttributesConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#attributes">Attributes</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AuditLogs

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>correlationId</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>message</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>instance</strong></td>
<td valign="top"><a href="#instance">Instance</a></td>
<td></td>
</tr>
</tbody>
</table>

### AuditLogsConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#auditlogs">AuditLogs</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AuthenticationType

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>protocol</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>clientId</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenantId</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>keySecret</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>objectId</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isDefault</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenants</strong></td>
<td valign="top">[<a href="#tenant">Tenant</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### AuthenticationTypeConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#authenticationtype">AuthenticationType</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### BreedingZone

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>geospatial_object_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipeline">Pipeline</a></td>
<td></td>
</tr>
</tbody>
</table>

### BreedingZoneConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#breedingzone">BreedingZone</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Collaborator

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>affiliation</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>contactPoint</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>identifier</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#person">Person</a></td>
<td></td>
</tr>
</tbody>
</table>

### CollaboratorConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#collaborator">Collaborator</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Component

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>version</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>releaseNo</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>info</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>instances</strong></td>
<td valign="top">[<a href="#instance">Instance</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>messages</strong></td>
<td valign="top">[<a href="#message">Message</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modules</strong></td>
<td valign="top">[<a href="#module">Module</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### ComponentConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#component">Component</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Country

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>iso3</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>full_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>vendors</strong></td>
<td valign="top">[<a href="#vendor">Vendor</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### CountryConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#country">Country</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Crop

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>crop_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>crop_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>servicetypes</strong></td>
<td valign="top">[<a href="#servicetype">ServiceType</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>programs</strong></td>
<td valign="top">[<a href="#program">Program</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>seasons</strong></td>
<td valign="top">[<a href="#season">Season</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### CropConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#crop">Crop</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Customer

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phone</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>officialEmail</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alternateEmail</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>jobTitle</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>languagePreference</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phoneExtension</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isActive</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>organizations</strong></td>
<td valign="top">[<a href="#organization">Organization</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>organization</strong></td>
<td valign="top"><a href="#organization">Organization</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenants</strong></td>
<td valign="top">[<a href="#tenant">Tenant</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### CustomerConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#customer">Customer</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### DataFormat

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>vendors</strong></td>
<td valign="top">[<a href="#vendor">Vendor</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### DataFormatConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#dataformat">DataFormat</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Delegation

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>startDate</strong></td>
<td valign="top"><a href="#date">Date</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>endDate</strong></td>
<td valign="top"><a href="#date">Date</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>DelegateTo</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>user</strong></td>
<td valign="top"><a href="#user">User</a></td>
<td></td>
</tr>
</tbody>
</table>

### DelegationConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#delegation">Delegation</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Donor

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>affiliation</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>contactPoint</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>indentifier</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#person">Person</a></td>
<td></td>
</tr>
</tbody>
</table>

### DonorConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#donor">Donor</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### HtmlTag

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>tagName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>translations</strong></td>
<td valign="top">[<a href="#translation">Translation</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### HtmlTagConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#htmltag">HtmlTag</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Instance

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>server</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>port</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>health</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sessions</strong></td>
<td valign="top">[<a href="#session">Session</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>auditlogss</strong></td>
<td valign="top">[<a href="#auditlogs">AuditLogs</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>component</strong></td>
<td valign="top"><a href="#component">Component</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenant">Tenant</a></td>
<td></td>
</tr>
</tbody>
</table>

### InstanceConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#instance">Instance</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Language

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>codeISO</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isbase</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>translations</strong></td>
<td valign="top">[<a href="#translation">Translation</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### LanguageConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#language">Language</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Marker

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>vendor</strong></td>
<td valign="top">[<a href="#vendor">Vendor</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>markersynonyms</strong></td>
<td valign="top">[<a href="#markersynonym">MarkerSynonym</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>assaygene</strong></td>
<td valign="top"><a href="#assaygene">AssayGene</a></td>
<td></td>
</tr>
</tbody>
</table>

### MarkerConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#marker">Marker</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### MarkerSynonym

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>synonym</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>marker</strong></td>
<td valign="top"><a href="#marker">Marker</a></td>
<td></td>
</tr>
</tbody>
</table>

### MarkerSynonymConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#markersynonym">MarkerSynonym</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Message

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>Description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sql</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>filterClause</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>translations</strong></td>
<td valign="top">[<a href="#translation">Translation</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>component</strong></td>
<td valign="top"><a href="#component">Component</a></td>
<td></td>
</tr>
</tbody>
</table>

### MessageConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#message">Message</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Module

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>help</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>route</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflownode</strong></td>
<td valign="top"><a href="#workflownode">WorkflowNode</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>actions</strong></td>
<td valign="top">[<a href="#action">Action</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>component</strong></td>
<td valign="top"><a href="#component">Component</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>translations</strong></td>
<td valign="top">[<a href="#translation">Translation</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### ModuleConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#module">Module</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Organization

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>legalName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phone</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>webpage</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>slogan</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>taxID</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>logo</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isActive</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>defaultAuthentication</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>defaultTheme</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>organization_code</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenants</strong></td>
<td valign="top">[<a href="#tenant">Tenant</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>customer</strong></td>
<td valign="top"><a href="#customer">Customer</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>customers</strong></td>
<td valign="top">[<a href="#customer">Customer</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### OrganizationConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#organization">Organization</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Partner

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>affiliation</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>contactPoint</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>indentifier</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#person">Person</a></td>
<td></td>
</tr>
</tbody>
</table>

### PartnerConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#partner">Partner</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Permission

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>roleaction</strong></td>
<td valign="top"><a href="#roleaction">RoleAction</a></td>
<td></td>
</tr>
</tbody>
</table>

### PermissionConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#permission">Permission</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Person

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>giveName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>familyName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>additionalName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>email</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>officialEmail</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>gender</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>hasCredential</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>jobTitle</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>knowsAbout</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>language</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phone</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>address</strong></td>
<td valign="top"><a href="#address">Address</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenant">Tenant</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>collaborators</strong></td>
<td valign="top">[<a href="#collaborator">Collaborator</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>donors</strong></td>
<td valign="top">[<a href="#donor">Donor</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>partners</strong></td>
<td valign="top">[<a href="#partner">Partner</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>vendors</strong></td>
<td valign="top">[<a href="#vendor">Vendor</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>projects</strong></td>
<td valign="top">[<a href="#project">Project</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### PersonConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#person">Person</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Phase

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>phase_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phase_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>schemes</strong></td>
<td valign="top">[<a href="#scheme">Scheme</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipeline">Pipeline</a></td>
<td></td>
</tr>
</tbody>
</table>

### PhaseConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#phase">Phase</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Pipeline

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>pipeline_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline_status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>schemes</strong></td>
<td valign="top">[<a href="#scheme">Scheme</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phases</strong></td>
<td valign="top">[<a href="#phase">Phase</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>projects</strong></td>
<td valign="top">[<a href="#project">Project</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>breedingzones</strong></td>
<td valign="top">[<a href="#breedingzone">BreedingZone</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>schemas</strong></td>
<td valign="top">[<a href="#schema">Schema</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### PipelineConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#pipeline">Pipeline</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Preference

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>user</strong></td>
<td valign="top"><a href="#user">User</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alert</strong></td>
<td valign="top"><a href="#alert">Alert</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>styletheme</strong></td>
<td valign="top"><a href="#styletheme">StyleTheme</a></td>
<td></td>
</tr>
</tbody>
</table>

### PreferenceConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#preference">Preference</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Process

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isBackground</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>dbFunction</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>callReport</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>path</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflownode</strong></td>
<td valign="top"><a href="#workflownode">WorkflowNode</a></td>
<td></td>
</tr>
</tbody>
</table>

### ProcessConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#process">Process</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Program

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>program_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>program_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>program_type</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>program_status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenant">Tenant</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>projects</strong></td>
<td valign="top">[<a href="#project">Project</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>crop</strong></td>
<td valign="top"><a href="#crop">Crop</a></td>
<td></td>
</tr>
</tbody>
</table>

### ProgramConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#program">Program</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Project

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>leader_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>project_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>project_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>project_status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>program</strong></td>
<td valign="top"><a href="#program">Program</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipeline">Pipeline</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#person">Person</a></td>
<td></td>
</tr>
</tbody>
</table>

### ProjectConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#project">Project</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Purpose

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>servicetypes</strong></td>
<td valign="top">[<a href="#servicetype">ServiceType</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>service</strong></td>
<td valign="top">[<a href="#service">Service</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### PurposeConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#purpose">Purpose</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Role

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>securityGroup</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>roleactions</strong></td>
<td valign="top">[<a href="#roleaction">RoleAction</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>user</strong></td>
<td valign="top">[<a href="#user">User</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### RoleAction

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>allow</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>action</strong></td>
<td valign="top"><a href="#action">Action</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>permissions</strong></td>
<td valign="top">[<a href="#permission">Permission</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>role</strong></td>
<td valign="top"><a href="#role">Role</a></td>
<td></td>
</tr>
</tbody>
</table>

### RoleActionConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#roleaction">RoleAction</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### RoleConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#role">Role</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Schema

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipeline">Pipeline</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>stages</strong></td>
<td valign="top">[<a href="#stage">Stage</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### SchemaConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#schema">Schema</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Scheme

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>scheme_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>scheme_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phase</strong></td>
<td valign="top">[<a href="#phase">Phase</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>stages</strong></td>
<td valign="top">[<a href="#stage">Stage</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipeline">Pipeline</a></td>
<td></td>
</tr>
</tbody>
</table>

### SchemeConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#scheme">Scheme</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Season

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>season_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>season_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>crop</strong></td>
<td valign="top">[<a href="#crop">Crop</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### SeasonConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#season">Season</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Service

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>servicetype</strong></td>
<td valign="top"><a href="#servicetype">ServiceType</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>purposes</strong></td>
<td valign="top">[<a href="#purpose">Purpose</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>serviceprovider</strong></td>
<td valign="top"><a href="#serviceprovider">ServiceProvider</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>assayclasss</strong></td>
<td valign="top">[<a href="#assayclass">Assayclass</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>vendors</strong></td>
<td valign="top">[<a href="#vendor">Vendor</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### ServiceConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#service">Service</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### ServiceProvider

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>servicetypes</strong></td>
<td valign="top">[<a href="#servicetype">ServiceType</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>services</strong></td>
<td valign="top">[<a href="#service">Service</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### ServiceProviderConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#serviceprovider">ServiceProvider</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### ServiceType

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>serviceprovider</strong></td>
<td valign="top"><a href="#serviceprovider">ServiceProvider</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>purpose</strong></td>
<td valign="top">[<a href="#purpose">Purpose</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>crop</strong></td>
<td valign="top"><a href="#crop">Crop</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>services</strong></td>
<td valign="top">[<a href="#service">Service</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### ServiceTypeConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#servicetype">ServiceType</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Session

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>webSession</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>remote_Address</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>remote_host</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>user</strong></td>
<td valign="top"><a href="#user">User</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>instance</strong></td>
<td valign="top"><a href="#instance">Instance</a></td>
<td></td>
</tr>
</tbody>
</table>

### SessionConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#session">Session</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Stage

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>stage_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>stage_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>order_number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>scheme</strong></td>
<td valign="top">[<a href="#scheme">Scheme</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>schema</strong></td>
<td valign="top">[<a href="#schema">Schema</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### StageConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#stage">Stage</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### StyleTheme

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>path</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>physicalName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isDefault</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>preferences</strong></td>
<td valign="top">[<a href="#preference">Preference</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### StyleThemeConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#styletheme">StyleTheme</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### TechnologyPlatform

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>assayclasss</strong></td>
<td valign="top">[<a href="#assayclass">Assayclass</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>vendor</strong></td>
<td valign="top">[<a href="#vendor">Vendor</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### TechnologyPlatformConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#technologyplatform">TechnologyPlatform</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Tenant

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>expiration</strong></td>
<td valign="top"><a href="#date">Date</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>expire</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>users</strong></td>
<td valign="top">[<a href="#user">User</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>instances</strong></td>
<td valign="top">[<a href="#instance">Instance</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflows</strong></td>
<td valign="top">[<a href="#workflow">Workflow</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>organization</strong></td>
<td valign="top"><a href="#organization">Organization</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>authenticationtype</strong></td>
<td valign="top"><a href="#authenticationtype">AuthenticationType</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>customer</strong></td>
<td valign="top"><a href="#customer">Customer</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>persons</strong></td>
<td valign="top">[<a href="#person">Person</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>programs</strong></td>
<td valign="top">[<a href="#program">Program</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### TenantConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#tenant">Tenant</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Trait

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>traitclass</strong></td>
<td valign="top"><a href="#traitclass">TraitClass</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>assaygenes</strong></td>
<td valign="top">[<a href="#assaygene">AssayGene</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### TraitClass

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>traits</strong></td>
<td valign="top">[<a href="#trait">Trait</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### TraitClassConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#traitclass">TraitClass</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### TraitConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#trait">Trait</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Translation

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>translation</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>languageTo</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alert</strong></td>
<td valign="top"><a href="#alert">Alert</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>attributes</strong></td>
<td valign="top"><a href="#attributes">Attributes</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>language</strong></td>
<td valign="top"><a href="#language">Language</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>message</strong></td>
<td valign="top"><a href="#message">Message</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>htmltag</strong></td>
<td valign="top"><a href="#htmltag">HtmlTag</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>module</strong></td>
<td valign="top"><a href="#module">Module</a></td>
<td></td>
</tr>
</tbody>
</table>

### TranslationConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#translation">Translation</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### User

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>userName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>userPassword</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>lastAccess</strong></td>
<td valign="top"><a href="#date">Date</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>defaultRole</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isIS</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sessions</strong></td>
<td valign="top">[<a href="#session">Session</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>delegations</strong></td>
<td valign="top">[<a href="#delegation">Delegation</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenant">Tenant</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>preferences</strong></td>
<td valign="top">[<a href="#preference">Preference</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>roles</strong></td>
<td valign="top">[<a href="#role">Role</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### UserConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#user">User</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Vendor

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>reference</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>technologyplatforms</strong></td>
<td valign="top">[<a href="#technologyplatform">TechnologyPlatform</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>markers</strong></td>
<td valign="top">[<a href="#marker">Marker</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>country</strong></td>
<td valign="top"><a href="#country">Country</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>dataformat</strong></td>
<td valign="top"><a href="#dataformat">DataFormat</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>service</strong></td>
<td valign="top">[<a href="#service">Service</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#person">Person</a></td>
<td></td>
</tr>
</tbody>
</table>

### VendorConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#vendor">Vendor</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### Workflow

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>help</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sortno</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenant">Tenant</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflownodes</strong></td>
<td valign="top">[<a href="#workflownode">WorkflowNode</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflownode</strong></td>
<td valign="top"><a href="#workflownode">WorkflowNode</a></td>
<td></td>
</tr>
</tbody>
</table>

### WorkflowConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#workflow">Workflow</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### WorkflowNode

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>help</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflow</strong></td>
<td valign="top"><a href="#workflow">Workflow</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflows</strong></td>
<td valign="top">[<a href="#workflow">Workflow</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>processs</strong></td>
<td valign="top">[<a href="#process">Process</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>modules</strong></td>
<td valign="top">[<a href="#module">Module</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### WorkflowNodeConnection

<table>
<thead>
<tr>
<th align="left">Field</th>
<th align="right">Argument</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>totalPages</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>totalElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>numberOfElements</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>content</strong></td>
<td valign="top">[<a href="#workflownode">WorkflowNode</a>]</td>
<td></td>
</tr>
</tbody>
</table>

## Inputs

### ActionInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>actionType</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>module</strong></td>
<td valign="top"><a href="#moduleinput">ModuleInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### AddressInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>country</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>locality</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>region</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>postOfficeBoxNumber</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>postalCode</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>streetAddress</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### AlertInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### AlertRuleInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sql</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>filterClause</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alert</strong></td>
<td valign="top"><a href="#alertinput">AlertInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### AssayGeneInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>trait</strong></td>
<td valign="top"><a href="#traitinput">TraitInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### AssayclassInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>technologyplatform</strong></td>
<td valign="top">[<a href="#technologyplatforminput">TechnologyPlatformInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>service</strong></td>
<td valign="top"><a href="#serviceinput">ServiceInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### AttributesInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>help</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sortno</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### AuditLogsInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>correlationId</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>message</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>instance</strong></td>
<td valign="top"><a href="#instanceinput">InstanceInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### AuthenticationTypeInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>protocol</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>clientId</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenantId</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>keySecret</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>objectId</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isDefault</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### BreedingZoneInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>geospatial_object_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipelineinput">PipelineInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### CollaboratorInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>affiliation</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>contactPoint</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>identifier</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#personinput">PersonInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### ComponentInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>version</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>releaseNo</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>info</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### CountryInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>iso3</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>full_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### CropInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>crop_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>crop_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### CustomerInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phone</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>officialEmail</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alternateEmail</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>jobTitle</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>languagePreference</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phoneExtension</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isActive</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>organization</strong></td>
<td valign="top"><a href="#organizationinput">OrganizationInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### DataFormatInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### DelegationInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>startDate</strong></td>
<td valign="top"><a href="#date">Date</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>endDate</strong></td>
<td valign="top"><a href="#date">Date</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>DelegateTo</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>user</strong></td>
<td valign="top"><a href="#userinput">UserInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### DonorInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>affiliation</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>contactPoint</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>indentifier</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#personinput">PersonInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### FilterInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>mod</strong></td>
<td valign="top"><a href="#filtermod">FilterMod</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>col</strong></td>
<td valign="top"><a href="#string">String</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>val</strong></td>
<td valign="top"><a href="#string">String</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### HtmlTagInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>tagName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### InstanceInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>server</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>port</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>health</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>component</strong></td>
<td valign="top"><a href="#componentinput">ComponentInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenantinput">TenantInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### LanguageInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>codeISO</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isbase</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### MarkerInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>vendor</strong></td>
<td valign="top">[<a href="#vendorinput">VendorInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>assaygene</strong></td>
<td valign="top"><a href="#assaygeneinput">AssayGeneInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### MarkerSynonymInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>synonym</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>marker</strong></td>
<td valign="top"><a href="#markerinput">MarkerInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### MessageInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>Description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sql</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>filterClause</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>component</strong></td>
<td valign="top"><a href="#componentinput">ComponentInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### ModuleInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>help</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>route</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflownode</strong></td>
<td valign="top"><a href="#workflownodeinput">WorkflowNodeInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>component</strong></td>
<td valign="top"><a href="#componentinput">ComponentInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### OrganizationInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>legalName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phone</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>webpage</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>slogan</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>taxID</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>logo</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isActive</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>defaultAuthentication</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>defaultTheme</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>organization_code</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>customer</strong></td>
<td valign="top"><a href="#customerinput">CustomerInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### PageInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>number</strong></td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>size</strong></td>
<td valign="top"><a href="#int">Int</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### PartnerInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>affiliation</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>contactPoint</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>indentifier</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#personinput">PersonInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### PermissionInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>roleaction</strong></td>
<td valign="top"><a href="#roleactioninput">RoleActionInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### PersonInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>giveName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>familyName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>additionalName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>email</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>officialEmail</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>gender</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>hasCredential</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>jobTitle</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>knowsAbout</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>language</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phone</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>address</strong></td>
<td valign="top"><a href="#addressinput">AddressInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenantinput">TenantInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### PhaseInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>phase_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phase_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipelineinput">PipelineInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### PipelineInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>pipeline_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline_status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### PreferenceInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>user</strong></td>
<td valign="top"><a href="#userinput">UserInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alert</strong></td>
<td valign="top"><a href="#alertinput">AlertInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>styletheme</strong></td>
<td valign="top"><a href="#stylethemeinput">StyleThemeInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### ProcessInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isBackground</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>dbFunction</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>callReport</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>path</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflownode</strong></td>
<td valign="top"><a href="#workflownodeinput">WorkflowNodeInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### ProgramInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>program_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>program_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>program_type</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>program_status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenantinput">TenantInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>crop</strong></td>
<td valign="top"><a href="#cropinput">CropInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### ProjectInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>leader_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>project_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>project_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>project_status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>program</strong></td>
<td valign="top"><a href="#programinput">ProgramInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipelineinput">PipelineInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#personinput">PersonInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### PurposeInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>service</strong></td>
<td valign="top">[<a href="#serviceinput">ServiceInput</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### RoleActionInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>allow</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>action</strong></td>
<td valign="top"><a href="#actioninput">ActionInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>role</strong></td>
<td valign="top"><a href="#roleinput">RoleInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### RoleInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>securityGroup</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>user</strong></td>
<td valign="top">[<a href="#userinput">UserInput</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### SchemaInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipelineinput">PipelineInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### SchemeInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>scheme_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>scheme_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>phase</strong></td>
<td valign="top">[<a href="#phaseinput">PhaseInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>pipeline</strong></td>
<td valign="top"><a href="#pipelineinput">PipelineInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### SeasonInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>season_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>season_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>crop</strong></td>
<td valign="top">[<a href="#cropinput">CropInput</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### ServiceInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>servicetype</strong></td>
<td valign="top"><a href="#servicetypeinput">ServiceTypeInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>serviceprovider</strong></td>
<td valign="top"><a href="#serviceproviderinput">ServiceProviderInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### ServiceProviderInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### ServiceTypeInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>serviceprovider</strong></td>
<td valign="top"><a href="#serviceproviderinput">ServiceProviderInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>purpose</strong></td>
<td valign="top">[<a href="#purposeinput">PurposeInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>crop</strong></td>
<td valign="top"><a href="#cropinput">CropInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### SessionInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>webSession</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>remote_Address</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>remote_host</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>user</strong></td>
<td valign="top"><a href="#userinput">UserInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>instance</strong></td>
<td valign="top"><a href="#instanceinput">InstanceInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### SortInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>col</strong></td>
<td valign="top"><a href="#string">String</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>mod</strong></td>
<td valign="top"><a href="#sortmod">SortMod</a></td>
<td></td>
</tr>
</tbody>
</table>

### StageInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>stage_code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>stage_name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>order_number</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>scheme</strong></td>
<td valign="top">[<a href="#schemeinput">SchemeInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>schema</strong></td>
<td valign="top">[<a href="#schemainput">SchemaInput</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### StyleThemeInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>path</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>physicalName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isDefault</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### TechnologyPlatformInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>vendor</strong></td>
<td valign="top">[<a href="#vendorinput">VendorInput</a>]</td>
<td></td>
</tr>
</tbody>
</table>

### TenantInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>expiration</strong></td>
<td valign="top"><a href="#date">Date</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>expire</strong></td>
<td valign="top"><a href="#boolean">Boolean</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>organization</strong></td>
<td valign="top"><a href="#organizationinput">OrganizationInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>authenticationtype</strong></td>
<td valign="top"><a href="#authenticationtypeinput">AuthenticationTypeInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>customer</strong></td>
<td valign="top"><a href="#customerinput">CustomerInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### TraitClassInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
</tbody>
</table>

### TraitInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>traitclass</strong></td>
<td valign="top"><a href="#traitclassinput">TraitClassInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### TranslationInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>translation</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>languageTo</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>alert</strong></td>
<td valign="top"><a href="#alertinput">AlertInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>attributes</strong></td>
<td valign="top"><a href="#attributesinput">AttributesInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>language</strong></td>
<td valign="top"><a href="#languageinput">LanguageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>message</strong></td>
<td valign="top"><a href="#messageinput">MessageInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>htmltag</strong></td>
<td valign="top"><a href="#htmltaginput">HtmlTagInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>module</strong></td>
<td valign="top"><a href="#moduleinput">ModuleInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### UserInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>userName</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>userPassword</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>lastAccess</strong></td>
<td valign="top"><a href="#date">Date</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>defaultRole</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>isIS</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenantinput">TenantInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### VendorInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>code</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>reference</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>status</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>country</strong></td>
<td valign="top"><a href="#countryinput">CountryInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>dataformat</strong></td>
<td valign="top"><a href="#dataformatinput">DataFormatInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>service</strong></td>
<td valign="top">[<a href="#serviceinput">ServiceInput</a>]</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>person</strong></td>
<td valign="top"><a href="#personinput">PersonInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### WorkflowInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>help</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>sortno</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant</strong></td>
<td valign="top"><a href="#tenantinput">TenantInput</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflownode</strong></td>
<td valign="top"><a href="#workflownodeinput">WorkflowNodeInput</a></td>
<td></td>
</tr>
</tbody>
</table>

### WorkflowNodeInput

<table>
<thead>
<tr>
<th colspan="2" align="left">Field</th>
<th align="left">Type</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" valign="top"><strong>name</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>description</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>help</strong></td>
<td valign="top"><a href="#string">String</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>tenant_id</strong></td>
<td valign="top"><a href="#int">Int</a></td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>id</strong></td>
<td valign="top"><a href="#id">ID</a>!</td>
<td></td>
</tr>
<tr>
<td colspan="2" valign="top"><strong>workflow</strong></td>
<td valign="top"><a href="#workflowinput">WorkflowInput</a></td>
<td></td>
</tr>
</tbody>
</table>

## Enums

### FilterMod

<table>
<thead>
<th align="left">Value</th>
<th align="left">Description</th>
</thead>
<tbody>
<tr>
<td valign="top"><strong>EQ</strong></td>
<td></td>
</tr>
<tr>
<td valign="top"><strong>LK</strong></td>
<td></td>
</tr>
</tbody>
</table>

### SortMod

<table>
<thead>
<th align="left">Value</th>
<th align="left">Description</th>
</thead>
<tbody>
<tr>
<td valign="top"><strong>ASC</strong></td>
<td></td>
</tr>
<tr>
<td valign="top"><strong>DES</strong></td>
<td></td>
</tr>
</tbody>
</table>

## Scalars

### Boolean

The `Boolean` scalar type represents `true` or `false`.

### Date

### ID

The `ID` scalar type represents a unique identifier, often used to refetch an object or as key for a cache. The ID type appears in a JSON response as a String; however, it is not intended to be human-readable. When expected as an input type, any string (such as `"4"`) or integer (such as `4`) input value will be accepted as an ID.

### Int

The `Int` scalar type represents non-fractional signed whole numeric values. Int can represent values between -(2^31) and 2^31 - 1.

### String

The `String` scalar type represents textual data, represented as UTF-8 character sequences. The String type is most often used by GraphQL to represent free-form human-readable text.

