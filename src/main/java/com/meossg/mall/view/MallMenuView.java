package com.meossg.mall.view;

import com.meossg.mall.model.dto.AdminDTO;

import java.util.Scanner;

public class MallMenuView {
    MallMemberMenuView MemberMenuView = new MallMemberMenuView();
    MallOrderManageView orderManageView = new MallOrderManageView();
    MallAnalysisView mallAnalysisView = new MallAnalysisView();


    public void mallMenu(AdminDTO admin) {
        String menu = """
                ============================
                1. 상품관리
                2. 주문관리
                3. 회원관리
                4. 통계 및 분석
                0. 로그아웃
                ============================
                선택 :\t""";
        while (true) {
            System.out.print(menu);
            String input = new Scanner(System.in).next();
            switch (input) {
                case "1":
                    // 상품 관리
                    new MallProductManageView().productManagingMenu();
                    break;
                case "2":
                    // 주문 관리
                    orderManageView.orderManagingMenu();
                    break;
                case "3":
                    MemberMenuView.memberManageMenu();
                    break;
                case "4":
                    mallAnalysisView.analysisMenu();
                    // 통계 및 분석
                    break;
                case "0":
                    // 로그아웃
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }
}
