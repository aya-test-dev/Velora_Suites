# AI Teammate Test Cases

This document outlines the test cases to validate the core behaviors, decision logic, and integrations of the Vylor AI teammate agent. Test cases are grouped into **unit tests**, **integration tests**, **end-to-end behavior tests**, and **error-handling/edge-case tests**.

---

## 1. Unit Tests

### 1.1 next_thought Generation
**Description:** Verify that the agent formulates an appropriate `next_thought` based on the incoming Slack event and context.

| Test Case ID | Input Context                                      | Expected next_thought                                       |
|--------------|----------------------------------------------------|-------------------------------------------------------------|
| UT-NT-01     | New direct message "hello" without context        | "Greet the user and ask how I can help."                  |
| UT-NT-02     | User requests to search for files                  | "Locate relevant files using fuzzy search or find."       |
| UT-NT-03     | Manager instruction provided                       | "Interpret manager instructions and plan accordingly."      |

### 1.2 Tool Selection Logic
**Description:** Ensure the agent selects the correct tool for each planned action.

| Test Case ID | Planned Action                       | Expected Tool Name               |
|--------------|--------------------------------------|----------------------------------|
| UT-TS-01     | Read entire file                     | `file_read_lines`                |
| UT-TS-02     | Search symbol definitions            | `find_files_or_code_symbols`     |
| UT-TS-03     | Recursive directory listing          | `directory_read`                 |

---

## 2. Integration Tests

### 2.1 Slack Event Callback Parsing
**Description:** Simulate incoming Slack webhook payloads and verify the agent extracts `event`, `thread`, and other fields correctly.

| Test Case ID | Payload Fixture                           | Assertions                                                                    |
|--------------|-------------------------------------------|-------------------------------------------------------------------------------|
| IT-SL-01     | Valid `message` event with user text      | `current_user_message.text` matches payload text                              |
| IT-SL-02     | Threaded reply message                    | `thread` array contains previous messages in correct order                    |

### 2.2 Manager Instructions Handling
**Description:** Feed a `manager_instructions` string and verify that the agent focuses on the sub-task without deviating.

| Test Case ID | Instruction                               | Assertion                                                               |
|--------------|-------------------------------------------|-------------------------------------------------------------------------|
| IT-MI-01     | "Switch to branch X"                    | next_tool_name = `git_local_command` with checkout command             |
| IT-MI-02     | "Create test cases for AI teammate"      | next_thought includes creation of test-cases document                  |

---

## 3. End-to-End Behavior Tests

### 3.1 Create Test Cases Flow
**Description:** Full interaction where a user requests test cases and the agent writes `AI_Teammate_Test_Cases.md` and finishes.

| Test Case ID | User Message                             | Expected File Written                     | Expected finish        |
|--------------|-------------------------------------------|-------------------------------------------|------------------------|
| E2E-TC-01    | "Can you send the test cases directly?"  | `AI_Teammate_Test_Cases.md` created       | Agent calls `finish`   |

---

## 4. Error-Handling & Edge Cases

### 4.1 Retry with Previous Attempts
**Description:** On retry due to post-validation error, ensure the agent summarizes previous work and produces a final complete response.

| Test Case ID | previous_attempts Non-empty                         | Assertion                                                                    |
|--------------|----------------------------------------------------|-------------------------------------------------------------------------------|
| EH-01        | `previous_attempts` contains system validation hint | next_thought acknowledges prior work and outputs full file content            |

### 4.2 Invalid Tool Selection
**Description:** If an unsupported tool is selected, the system should reject before execution.

| Test Case ID | Tool Name = "invalid_tool"                         | Agent must not call invalid_tool; should select a valid replacement tool     |

---

## 5. Test Fixtures & Mocks

- **Slack Event Fixtures:** JSON fixtures under `tests/fixtures/slack/`
- **Manager Instruction Samples:** Strings under `tests/fixtures/manager/`
- **File System Mocks:** In-memory FS for `file_read_*` and `file_write` operations.

---

*End of AI Teammate Test Cases*
