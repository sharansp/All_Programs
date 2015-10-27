
utilInboxEditorConfig = {
    type: "Roles",
    title: "User access definitions for inbox editor",
    AccessDefinition: {
        GlobalAccess: {
            AllowedUsers: ['KGOPINAT', 'PSRINIV1', 'MALI2', 'AMADHUSU', 'MSANKARA', 'MREDDY1', 'BGOUDAR', 'PMAKENA', 'HTHOMAS'],
            AllowedUsersFullName: []
        },
        InboxLevelAccess: {
			InboxDistributionWarehouseMonitorOutboundTU: { AllowedUsers: ["SDURAIRA"],AllowedUsersFullName: []
			},
            InboxSalesCustomerServiceWorkCenter: {
                AllowedUsers: [],
				AllowedUsersFullName: []
                
            }
        }
    }
}